package com.company;

import container.basic.heavy.CoolingContainerBasic;
import container.basic.heavy.dangerous.ExplosivesContainerBasic;
import container.basic.heavy.dangerous.ToxicGranularContainerBasic;
import container.basic.heavy.dangerous.ToxicLiquidContainerBasic;
import container.basic.standard.HeavyContainerBasic;
import container.basic.standard.LiquidsContainerBasic;
import container.basic.standard.StandardContainerBasic;
import magazine.Magazine;
import magazine.Train;
import sender.Sender;
import sender.SenderCount;
import ship.ShipAbstract;
import ship.ShipBasic;
import ship.ShipCount;
import writeToFile.Write;

public class Interface {
    public void display() {
        System.out.println("1. Create ship");
        System.out.println("2. Create Standard container");
        System.out.println("3. Create Heavy container");
        System.out.println("4. Create Cooling container");
        System.out.println("5. Create container with liquid");
        System.out.println("6. Create container with toxic liquid");
        System.out.println("7. Create container with toxic granular");
        System.out.println("8. Create container with explosives");
        System.out.println("9. List of ships");
        System.out.println("10. List of containers in magazine");
        System.out.println("11. List of containers on ship");
        System.out.println("12. List of containers on train");
        System.out.println("13. Load container on ship");
        System.out.println("14. Load container on train");
        System.out.println("15. Unload container from ship");
        System.out.println("16. Manually utilize container");
        System.out.println("17. Exit");
    }

    public void createShips(ShipCount shipCount) {

        shipCount.ships.add(new ShipBasic(5, 2, 3, 15, 15000,
                "Cage", "London", "Helsinki", "Lisbon"));
        shipCount.ships.add(new ShipBasic(1, 2, 1, 5, 13000,
                "Hammer", "Sydney", "London", "Gdansk"));
        shipCount.ships.add(new ShipBasic(2, 2, 1, 10, 21000,
                "Shark", "Dover", "Brest", "Amsterdam"));
        shipCount.ships.add(new ShipBasic(1, 1, 1, 8, 10000,
                "Green", "Malmo", "Nassau", "Lisbon"));
        shipCount.ships.add(new ShipBasic(2, 4, 3, 12, 18000,
                "Tayfun", "New Orlean", "Ceuta", "Lisbon"));

    }

    public void createContainers(ShipCount shipCount, SenderCount senderCount, Magazine magazine) {
        byte[] pesel = {9, 7, 1, 2, 2, 3, 7, 5, 3, 4, 5};
        byte[] pesel2 = {8, 7, 0, 5, 1, 2, 5, 3, 1, 7, 2};
        byte[] pesel3 = {7, 5, 0, 8, 1, 7, 3, 9, 2, 4, 9};
        senderCount.senders.add(new Sender("Mike", "Nowak", pesel, "London"));
        senderCount.senders.add(new Sender("Andy", "Jones", pesel2, "Gdansk"));
        senderCount.senders.add(new Sender("Clark", "Kent", pesel3, "New York"));
        shipCount.ships.get(0).containerList.add(new CoolingContainerBasic(senderCount.senders.get(1), 1200, 1000,
                15, 3, 3, "Steel", 5, 2000));
        shipCount.ships.get(0).containerList.add(new StandardContainerBasic(senderCount.senders.get(0), 1000, 900,
                17, 4, 3));
        shipCount.ships.get(0).containerList.add(new ExplosivesContainerBasic(senderCount.senders.get(2), 1000, 900,
                16, 3, 2, "Bronze", 4));
        shipCount.ships.get(1).containerList.add(new LiquidsContainerBasic(senderCount.senders.get(0), 1200, 1000,
                13, 4, 2, 1200));
        shipCount.ships.get(1).containerList.add(new HeavyContainerBasic(senderCount.senders.get(1), 1500, 1250,
                15, 4, 3, "Steel Alloy"));
        shipCount.ships.get(2).containerList.add(new ToxicGranularContainerBasic(senderCount.senders.get(1), 1400, 1200,
                14, 3, 2, "Steel", 1000));
        shipCount.ships.get(2).containerList.add(new ExplosivesContainerBasic(senderCount.senders.get(2), 1200, 1000,
                12, 3, 2, "Steel", 3));
        shipCount.ships.get(2).containerList.add(new StandardContainerBasic(senderCount.senders.get(0), 1100, 950,
                14, 3, 2));
        shipCount.ships.get(3).containerList.add(new CoolingContainerBasic(senderCount.senders.get(1), 1400, 1100,
                16, 4, 3, "Harden Steel", 2, 2500));
        shipCount.ships.get(3).containerList.add(new ToxicLiquidContainerBasic(senderCount.senders.get(0), 1600, 1400,
                19, 3, 3, "Steel", 80, "Titan"));
        shipCount.ships.get(4).containerList.add(new LiquidsContainerBasic(senderCount.senders.get(0), 1300, 1100,
                18, 3, 2, 1800));
        shipCount.ships.get(4).containerList.add(new HeavyContainerBasic(senderCount.senders.get(1), 1500, 1200,
                15, 4, 2, "Harden Steel"));
        shipCount.ships.get(4).containerList.add(new ToxicGranularContainerBasic(senderCount.senders.get(1), 1400, 1200,
                20, 4, 3, "Steel", 800));
        magazine.addContainer(new StandardContainerBasic(senderCount.senders.get(0), 900, 750,
                12, 3, 2));
        magazine.addContainer(new CoolingContainerBasic(senderCount.senders.get(1), 1300, 1150,
                16, 4, 3, "Steel", -5, 1800));
        magazine.addContainer(new ExplosivesContainerBasic(senderCount.senders.get(2), 1200, 1000,
                15, 3, 3, "Harden Steel", 4));
    }

    public void close(Magazine magazine, ShipCount shipCount, SenderCount senderCount, Train train) {
        magazine.sortMagazine();
        shipCount.sortShips();
        for (ShipAbstract ship : shipCount.ships) {
            ship.sortContainers();
        }
        Write write = new Write();
        write.WriteMagazine(magazine);
        write.WriteShip(shipCount);
        write.WriteSeder(senderCount);
        write.WriteTrain(train);
        System.exit(0);
    }


}
