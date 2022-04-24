package com.company;

import com.theads.PassingDays;
import container.heavy.CoolingContainer;
import container.heavy.dangerous.ExplosivesContainer;
import container.heavy.dangerous.ToxicGranularContainer;
import container.heavy.dangerous.ToxicLiquidContainer;
import container.standard.HeavyContainer;
import container.standard.LiquidsContainer;
import container.standard.StandardContainer;
import magazine.Magazine;
import magazine.Train;
import readFromFile.Read;
import sender.SenderCount;
import ship.Ship;
import ship.ShipCount;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShipCount shipCount = new ShipCount();
        Magazine magazine = new Magazine(15);
        Train train = new Train(10);
        Interface anInterface = new Interface();
        SenderCount senderCount = new SenderCount();
        Read read = new Read();
        anInterface.createShips(shipCount);
        anInterface.createContainers(shipCount, senderCount, magazine);
        PassingDays passingDays = new PassingDays(magazine);
        passingDays.start();

        while (true) {
            anInterface.display();
            int userChoice = scanner.nextInt();
            try {
                switch (userChoice) {
                    case 1 -> shipCount.ships.add(new Ship());
                    case 2 -> magazine.addContainer(new StandardContainer(senderCount.senders.get(0)));
                    case 3 -> magazine.addContainer(new HeavyContainer(senderCount.senders.get(1)));
                    case 4 -> magazine.addContainer(new CoolingContainer(senderCount.senders.get(1)));
                    case 5 -> magazine.addContainer(new LiquidsContainer(senderCount.senders.get(0)));
                    case 6 -> magazine.addContainer(new ToxicLiquidContainer(senderCount.senders.get(0)));
                    case 7 -> magazine.addContainer(new ToxicGranularContainer(senderCount.senders.get(1)));
                    case 8 -> magazine.addContainer(new ExplosivesContainer(senderCount.senders.get(2)));
                    case 9 -> shipCount.displayShips();
                    case 10 -> magazine.getListOfContainersInMagazine();
                    case 11 -> shipCount.getListOfContainersOnShip();
                    case 12 -> train.getListContainersOnTrain();
                    case 13 -> magazine.loadOnShip(shipCount);
                    case 14 -> magazine.unloadFromShip(shipCount);
                    case 15 -> train.loadOnTrain(shipCount);
                    case 16 -> magazine.manuallyUtilizeContainer();
                    case 17 -> anInterface.close(magazine, shipCount, senderCount, train);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
