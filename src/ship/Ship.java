package ship;

import container.Container;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Ship implements Serializable {
    public int shipId;
    public int maxDangerous;
    public int maxHeavy;
    public int maxElectric;
    public int maxAll;
    public int maxWeight;
    public int dangerousAmount;
    public int heavyAmount;
    public int electricAmount;
    public int containerWeight;
    public String name;
    public String homePort;
    public String transportFrom;
    public String transportTo;
    public List<Container> containerList = new LinkedList<>();

    public Ship(int maxDangerous, int maxHeavy, int maxElectric, int maxAll, int maxWeight, String name, String homePort, String transportFrom, String transportTo) {
        this.maxDangerous = maxDangerous;
        this.maxHeavy = maxHeavy;
        this.maxElectric = maxElectric;
        this.maxAll = maxAll;
        this.maxWeight = maxWeight;
        this.name = name;
        this.homePort = homePort;
        this.transportFrom = transportFrom;
        this.transportTo = transportTo;
        this.shipId = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
    }

    public String toString(){
        return "Id: " + shipId + "\nMax Dangerous: " + maxDangerous + "\nMax Heavy: " + maxHeavy + "\nMaxElectric: "
                + maxElectric + "\nMax All: " + maxAll + "\nDangerous containers: " + dangerousAmount + "\nHeavy containers: "
                + heavyAmount + "\nElectric containers: " + electricAmount + "\nName: " + name + "\nHome Port" + homePort
                + "\nTransport from: " + transportFrom + "\nTransport to: " + transportTo + "\n";
    }
}
