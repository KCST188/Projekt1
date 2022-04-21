package ship;

import container.Container;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShipAbstract {
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
    public Scanner scanner = new Scanner(System.in);

}


