package magazine;

import container.Container;
import ship.ShipAbstract;
import ship.ShipCount;

public class Train extends Port {

    public Train(int maxContainerCount) {
        super(maxContainerCount);
    }

    public void loadOnTrain(ShipCount shipCount) {
        ShipAbstract ship = shipCount.findShipById();
        Container container = shipCount.findContainerOnShipById(ship);
        if (ship == null || container == null) System.out.println("Container or ship don't exist");
        else {
            if (listOfContainers.size() < maxContainerCount) {
                ship.containerList.remove(container);
                listOfContainers.add(container);
            } else {
                TrainThread trainThread = new TrainThread();
                trainThread.start();
                listOfContainers.clear();
            }
        }
    }

    public void getListContainersOnTrain(){
        for (Container container: listOfContainers) {
            System.out.println(container.toString());
        }
    }
}
