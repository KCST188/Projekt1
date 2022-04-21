package ship;

import java.util.concurrent.ThreadLocalRandom;

public class Ship extends ShipAbstract {

    public Ship() {
        System.out.println("Write max dangerous containers");
        this.maxDangerous = Integer.parseInt(scanner.nextLine());
        System.out.println("Write max heavy containers");
        this.maxHeavy = Integer.parseInt(scanner.nextLine());
        System.out.println("Write max electric containers");
        this.maxElectric = Integer.parseInt(scanner.nextLine());
        System.out.println("Write max containers");
        this.maxAll = Integer.parseInt(scanner.nextLine());
        System.out.println("Write max weight");
        this.maxWeight = Integer.parseInt(scanner.nextLine());
        System.out.println("Write name");
        this.name = scanner.nextLine();
        System.out.println("Write home Port");
        this.homePort = scanner.nextLine();
        System.out.println("Write from is transport");
        this.transportFrom = scanner.nextLine();
        System.out.println("Write where to is transport");
        this.transportTo = scanner.nextLine();
        this.shipId = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
    }

    public String toString() {
        return "Id: " + shipId + "\nMax Dangerous: " + maxDangerous + "\nMax Heavy: " + maxHeavy + "\nMaxElectric: "
                + maxElectric + "\nMax All: " + maxAll + "\nDangerous containers: " + dangerousAmount + "\nHeavy containers: "
                + heavyAmount + "\nElectric containers: " + electricAmount + "\nName: " + name + "\nHome Port" + homePort
                + "\nTransport from: " + transportFrom + "\nTransport to: " + transportTo + "\n";
    }
}
