package ship;

import java.util.concurrent.ThreadLocalRandom;

public class Ship extends ShipAbstract {

    public Ship() {
        int maxDangerous;
        int maxHeavy;
        int maxElectric;
        int maxAll;
        int maxWeight;
        do {
            System.out.println("Write max dangerous containers no more than 3");
            maxDangerous = Integer.parseInt(scanner.nextLine());
        } while (maxDangerous < 0 || maxDangerous > 3);
        this.maxDangerous = maxDangerous;
        do {
            System.out.println("Write max heavy containers no more than 6");
            maxHeavy = Integer.parseInt(scanner.nextLine());
        } while (maxHeavy < 0 || maxHeavy > 6);
        this.maxHeavy = maxHeavy;
        do {
            System.out.println("Write max electric containers no more than 3");
            maxElectric = Integer.parseInt(scanner.nextLine());
        } while (maxElectric < 0 || maxElectric > 3);
        this.maxElectric = maxElectric;
        do {
            System.out.println("Write max containers more than " + this.maxHeavy + " and less than 20");
            maxAll = Integer.parseInt(scanner.nextLine());
        } while (maxAll < this.maxHeavy || maxAll > 20);
        this.maxAll = maxAll;
        do {
            System.out.println("Write max weight between 10 000 and 60 000 kg");
            maxWeight = Integer.parseInt(scanner.nextLine());
        } while (maxWeight < 10000 || maxWeight > 60000);
        this.maxWeight = maxWeight;
        System.out.println("Write name");
        this.name = scanner.nextLine();
        System.out.println("Write home Port");
        this.homePort = scanner.nextLine();
        System.out.println("Write from is transport");
        this.transportFrom = scanner.nextLine();
        System.out.println("Write where to transport is");
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
