package magazine;

import container.Container;
import ship.ShipAbstract;
import ship.ShipCount;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Magazine extends Port {

    public static int maxTimeExplosives;
    public static int maxTimeLiquidToxic;
    public static int maxTimeGranularToxic;
    public int maxWarnings = 2;
    public LocalDate date = LocalDate.now();


    public Magazine(int maxContainers) {
        super(maxContainers);
        maxTimeExplosives = 5;
        maxTimeLiquidToxic = 10;
        maxTimeGranularToxic = 14;
        this.maxWarnings = 2;
    }

    public void dayPassed() throws IrresponsibleSenderWithDangerousGoods {
        for (Container container : listOfContainers) {
            container.daysInMagazine++;
            utilizeContainer(container);
        }
    }

    public void utilizeContainer(Container container) throws IrresponsibleSenderWithDangerousGoods {
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
        Scanner scanner = new Scanner(System.in);
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
        if (ship.maxAll <= ship.containerList.size()) System.out.println("Too much containers in magazine");
        else if (ship.maxWeight < ship.containerWeight) System.out.println("Container too heavy");
        else {
            ship.containerList.add(container);
            listOfContainers.remove(container);
            container.daysInMagazine = 0;
            container.dateArrived = date;
        }
    }

    private void unload(ShipAbstract ship, Container container) {
        ship.containerList.remove(container);
        listOfContainers.add(container);
        container.dateArrived = date;
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
        else if (container.sender.banned)
            System.out.println("This sender is banned, return container with id: " + container.id + " to sender.\n");
        else {
            unload(ship, container);
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

    public void sortMagazine() {
        Collections.sort(listOfContainers, new Comparator<>() {
            int comparison;

            @Override
            public int compare(Container o1, Container o2) {
                comparison = o2.daysInMagazine - o1.daysInMagazine;
                if (comparison == 0) {
                    return o2.sender.name.compareTo(o1.sender.name);
                }
                return comparison;
            }
        });
    }
}
