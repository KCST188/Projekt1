package magazine;

import container.Container;
import ship.Ship;

public class Train extends Port {

    private int maxContainerCount = 10;

    public Train(int maxContainerCount) {
        super(maxContainerCount);
    }

    public void loadOnTrain(Ship ship, Container container) {
        if (listOfContainers.size() < maxContainerCount) {
            ship.containerList.remove(container);
            listOfContainers.add(container);
        }else {
            System.out.println("j");
        }
    }
}
