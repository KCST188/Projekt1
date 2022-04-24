package ship;

import container.Container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShipCount {
    public ArrayList<ShipAbstract> ships = new ArrayList<>();


    public ShipAbstract findShipById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write ship id");
        int id = Integer.parseInt(scanner.nextLine());
        for (ShipAbstract ship : ships) {
            if (ship.shipId == id) return ship;
        }
        return null;
    }

    public Container findContainerOnShipById(ShipAbstract ship) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write container id");
        int id = Integer.parseInt(scanner.nextLine());
        for (Container container : ship.containerList) {
            if (container.id == id) {
                return container;
            }
        }
        return null;
    }

    public void getListOfContainersOnShip() {
        ShipAbstract ship = findShipById();
        if (ship == null) System.out.println("Ship don't exist");
        else {
            for (Container container : ship.containerList) {
                System.out.println(container.toString());
            }
        }
    }

    public void displayShips() {
        for (ShipAbstract ship : ships) {
            System.out.println(ship.toString());
        }
    }

    public void sortShips() {
        ships.sort((o1, o2) -> o2.name.compareTo(o1.name));
    }
}
