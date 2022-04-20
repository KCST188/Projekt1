package magazine;

import container.Container;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public abstract class Port implements Serializable {

    public int maxContainerCount;
    public List<Container> listOfContainers = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public Port(int maxContainerCount) {
        this.maxContainerCount = maxContainerCount;
    }
}
