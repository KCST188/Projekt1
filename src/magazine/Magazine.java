package magazine;

import container.Container;
import ship.ShipAbstract;
import ship.ShipCount;

import java.time.LocalDate;

public class Magazine extends Port {

    public static final int maxTimeExplosives = 5;
    public static final int maxTimeLiquidToxic = 10;
    public static final int maxTimeGranularToxic = 14;
    private final int maxWarnings = 2;
    public LocalDate date = LocalDate.now();


    public Magazine(int maxContainers) {
        super(maxContainers);
    }

    public void dayPassed() throws IrresponsibleSenderWithDangerousGoods {
        for (Container container : listOfContainers) {
            container.daysInMagazine++;
            utilizeContainer(container);
        }
    }

    public void utilizeContainer(Container container) throws IrresponsibleSenderWithDangerousGoods{
        if ((container.daysInMagazine > maxTimeExplosives && container.isExplosive) ||
                (container.daysInMagazine > maxTimeLiquidToxic && container.isToxicLiquid) ||
                (container.daysInMagazine > maxTimeGranularToxic && container.isToxicGranular)) {
            listOfContainers.remove(container);
            container.sender.getWarning();
            container.dateUtilize = date;
            if (container.sender.warning >= maxWarnings) {
                container.sender.getBanned();
            }
            date = date.plusDays(1);
            throw new IrresponsibleSenderWithDangerousGoods("Utilization of container with Id: " + container.id + "\nDate arrived: "
                    + container.dateArrived + "\nDate of utilization: " + container.dateUtilize);
        }

    }

    public Container findContainerById() {
        System.out.println("Write container id");
        int id = Integer.parseInt(scanner.nextLine());
        for (Container container : listOfContainers) {
            if (container.id == id) return container;
        }
        return null;
    }

    public void manuallyUtilizeContainer() {
        Container container = findContainerById();
        if (container == null) System.out.println("Container don't exist");
        else listOfContainers.remove(container);
    }

    private void load(ShipAbstract ship, Container container) {
        if (ship.maxAll <= ship.containerList.size()) System.out.println("Container too heavy");
        else if (ship.maxWeight < ship.containerWeight) System.out.println("Too much containers in magazine");
        else {
            ship.containerList.add(container);
            listOfContainers.remove(container);
            container.daysInMagazine = 0;
        }
    }

    private void unload(ShipAbstract ship, Container container) {
        ship.containerList.remove(container);
        listOfContainers.add(container);
    }

    public void loadOnShip(ShipCount shipCount) {
        ShipAbstract ship = shipCount.findShipById();
        Container container = findContainerById();
        if (ship == null || container == null) System.out.println("Container or ship don't exist");
        else {
            if (container.isDangerous && ship.maxDangerous < ship.dangerousAmount) {
                load(ship, container);
                ship.dangerousAmount++;
                ship.containerWeight++;
            } else if (container.isHeavy && ship.maxHeavy < ship.heavyAmount) {
                load(ship, container);
                ship.heavyAmount++;
                ship.containerWeight++;
            } else if (container.isElectric && ship.maxElectric < ship.electricAmount) {
                load(ship, container);
                ship.electricAmount++;
                ship.containerWeight++;
            } else {
                load(ship, container);
                ship.containerWeight++;
            }
        }
    }

    public void unloadFromShip(ShipCount shipCount) {
        ShipAbstract ship = shipCount.findShipById();
        Container container = shipCount.findContainerOnShipById(ship);
        if (ship == null || container == null) System.out.println("Container or ship don't exist");
        else if (container.sender.banned) System.out.println("This sender is banned");
        else {
            unload(ship, container);
            container.dateArrived = date;
        }
    }

    public void getListOfContainersInMagazine() {
        for (Container container : listOfContainers) {
            System.out.println(container.toString());
        }
    }

    public void addContainer(Container container) {
        if (maxContainerCount == listOfContainers.size()) System.out.println("Too many containers!");
        else {
            listOfContainers.add(container);
            container.dateArrived = date;
        }
    }

    public class IrresponsibleSenderWithDangerousGoods extends Exception {
        public IrresponsibleSenderWithDangerousGoods(String message) {
            super(message);
            System.out.println(message);
        }
    }
}
