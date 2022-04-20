package magazine;

import container.Container;
import ship.Ship;
import ship.ShipCount;

public class Magazine extends Port {

    private final int maxTimeExplosives = 5;
    private final int maxTimeLiquidToxic = 10;
    private final int maxTimeGranularToxic = 14;
    private final int maxWarnings = 2;


    public Magazine(int maxContainers) {
        super(maxContainers);
    }

    public void dayPassed() {
        for (Container container : listOfContainers) {
            container.daysInMagazine++;
            utilizeContainer();
        }
    }

    private void utilizeContainer() {
        for (Container container : listOfContainers) {
            if (container.isDangerous) {
                if ((container.daysInMagazine > maxTimeExplosives && container.isExplosive) ||
                        (container.daysInMagazine > maxTimeLiquidToxic && container.isToxicLiquid) ||
                        (container.daysInMagazine > maxTimeGranularToxic && container.isToxicGranular)) {
                    listOfContainers.remove(container);
                    container.sender.getWarning();
                    if (container.sender.warning >= maxWarnings) container.sender.getBanned();
                }
            }
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

    private void load(Ship ship, Container container) {
        if (ship.maxAll <= ship.containerList.size()) System.out.println("Container too heavy");
        else if (ship.maxWeight < ship.containerWeight) System.out.println("Too much containers in magazine");
        else {
            ship.containerList.add(container);
            listOfContainers.remove(container);
            container.daysInMagazine = 0;
        }
    }

    private void unload(Ship ship, Container container) {
        ship.containerList.remove(container);
        listOfContainers.add(container);
    }

    public void loadOnShip(ShipCount shipCount) {
        Ship ship = shipCount.findShipById();
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
        Ship ship = shipCount.findShipById();
        Container container = findContainerById();
        if (ship == null || container == null) System.out.println("Container or ship don't exist");
        else unload(ship, container);
    }

    public void getListOfContainersInMagazine() {
        for (Container container : listOfContainers) {
            System.out.println(container.toString());
        }
    }

    public void addContainer(Container container) {
        if (maxContainerCount == listOfContainers.size()) System.out.println("Too many containers!");
        else listOfContainers.add(container);
    }
}
