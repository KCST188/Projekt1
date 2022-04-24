package magazine;

import container.Container;

import java.util.LinkedList;
import java.util.List;

public abstract class Port {

    public int maxContainerCount;
    public List<Container> listOfContainers = new LinkedList<>();

    public Port(int maxContainerCount) {
        this.maxContainerCount = maxContainerCount;
    }
}
