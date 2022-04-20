package ship;

import container.Container;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ShipCount implements Serializable {
    public ArrayList<Ship> ships = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Ship findShipById() {
        System.out.println("Write ship id");
        int id = Integer.parseInt(scanner.nextLine());
        for (Ship ship : ships) {
            if (ship.shipId == id) return ship;
        }
        return null;
    }

    public void getListOfContainersOnShip() {
        Ship ship = findShipById();
        if (ship == null) System.out.println("Ship don't exist");
        else {
            for (Container container : ship.containerList) {
                System.out.println(container.toString());
            }
        }
    }

    public void addShip() {
        System.out.println("Write max number of dangerous containers");
        int maxDangerous = Integer.parseInt(scanner.nextLine());

        System.out.println("Write max number of heavy containers");
        int maxHeavy = Integer.parseInt(scanner.nextLine());

        System.out.println("Write max number of electric containers");
        int maxElectric = Integer.parseInt(scanner.nextLine());

        System.out.println("Write max number of containers");
        int maxAll = Integer.parseInt(scanner.nextLine());

        System.out.println("Write max weight of Containers");
        int maxWeight = Integer.parseInt(scanner.nextLine());

        System.out.println("Write ship name");
        String name = scanner.nextLine();

        System.out.println("Write ships home port");
        String homePort = scanner.nextLine();

        System.out.println("Write port that ship is coming from");
        String transportFrom = scanner.nextLine();

        System.out.println("Write port that ship is coming to");
        String transportTo = scanner.nextLine();

        Ship ship = new Ship(maxDangerous, maxHeavy, maxElectric, maxAll, maxWeight, name, homePort, transportFrom, transportTo);
        ships.add(ship);
    }

    public void displayShips() {
        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }
    }
}
