package ship;

import container.Container;

import java.util.LinkedList;
import java.util.List;

public class Ship {
    private int shipId;
    public int maxToxicAndExplosive;
    public int maxHeavy;
    public int maxElectric;
    public int maxAll;
    public int maxWeight;
    public int daysInMagazine = 0;
    public String name;
    public String homePort;
    public String transportFrom;
    public String transportTo;
    public List<Container> containerList = new LinkedList<>();

    public Ship(int shipId) {
        this.shipId = shipId;
    }

    public void loadContainerOnShip() {

    }
    public void unloadContainer() {

    }
}
