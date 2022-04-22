package com.company;

import container.heavy.CoolingContainer;
import container.heavy.dangerous.ExplosivesContainer;
import container.heavy.dangerous.ToxicGranularContainer;
import container.heavy.dangerous.ToxicLiquidContainer;
import container.standard.HeavyContainer;
import container.standard.LiquidsContainer;
import container.standard.StandardContainer;
import magazine.Magazine;
import magazine.Train;
import sender.Sender;
import ship.Ship;
import ship.ShipCount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ShipCount shipCount = new ShipCount();
        Magazine magazine = new Magazine(15);
        Train train = new Train(10);
        Interface anInterface = new Interface();
        byte[] pesel = {9, 7, 1, 2, 2, 3, 7, 5, 3, 4, 5};
        byte[] pesel2 = {8, 7, 0, 5, 1, 2, 5, 3, 1, 7, 2};
        Sender sender = new Sender("Mike", "Nowak", pesel, "London");
        Sender sender2 = new Sender("Andy", "Jones", pesel2, "Gdansk");
        anInterface.createShips(shipCount);
        anInterface.createContainers(shipCount, sender, magazine);
        PassingDays passingDays = new PassingDays(magazine);
        passingDays.start();
        while (true) {
            anInterface.display();
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> shipCount.ships.add(new Ship());
                case 2 -> magazine.addContainer(new StandardContainer(sender));
                case 3 -> magazine.addContainer(new HeavyContainer(sender));
                case 4 -> magazine.addContainer(new CoolingContainer(sender2));
                case 5 -> magazine.addContainer(new LiquidsContainer(sender));
                case 6 -> magazine.addContainer(new ToxicLiquidContainer(sender2));
                case 7 -> magazine.addContainer(new ToxicGranularContainer(sender2));
                case 8 -> magazine.addContainer(new ExplosivesContainer(sender2));
                case 9 -> shipCount.displayShips();
                case 10 -> magazine.getListOfContainersInMagazine();
                case 11 -> shipCount.getListOfContainersOnShip();
                case 12 -> magazine.loadOnShip(shipCount);
                case 13 -> magazine.unloadFromShip(shipCount);
                case 14 -> train.loadOnTrain(shipCount);
                case 15 -> magazine.manuallyUtilizeContainer();
                case 16 -> System.exit(0);
            }
        }
    }
}
