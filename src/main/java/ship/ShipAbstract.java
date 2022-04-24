package ship;

import container.Container;
import java.util.*;

public abstract class ShipAbstract {
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
    public LinkedList<Container> containerList = new LinkedList<>();

    class SortByWeight implements Comparator<Container> {
        public int compare(Container a, Container b){
            return b.weightBrutto - a.weightBrutto;
        }
    }

    public void sortContainers(){
        containerList.sort(new SortByWeight());
    }

}


