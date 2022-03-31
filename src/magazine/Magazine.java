package magazine;

import container.Container;
import ship.Ship;

import java.util.LinkedList;
import java.util.List;

public class Magazine extends Port{

    private int maxTimeExplosives = 5;
    private int maxTimeLiquidToxic = 10;
    private int maxTimeGranularToxic = 14;
    public List<Container> listOfContainers = new LinkedList<>();

    public Magazine(int maxContainers) {
        super(maxContainers);
    }

    public void utilizeContainer() {

    }
    public void manuallyUtilizeContainer() {

    }

    public void loadOnShip(Ship ship) {

    }

    public void getListOfContainers() {

    }



}
