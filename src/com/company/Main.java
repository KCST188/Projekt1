package com.company;

import container.heavy.CoolingContainer;
import container.heavy.dangerous.ExplosivesContainer;
import container.heavy.dangerous.ToxicGranularContainer;
import container.heavy.dangerous.ToxicLiquidContainer;
import container.standard.HeavyContainer;
import container.standard.LiquidsContainer;
import container.standard.StandardContainer;
import magazine.Magazine;
import sender.Sender;
import ship.Ship;
import ship.ShipCount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShipCount shipCount = new ShipCount();
        Magazine magazine = new Magazine(15);
        shipCount.ships.add(new Ship(5, 2, 3, 15, 15000,
                "Lol", "London", "Helsinki", "Lisbon"));
        byte[] pesel = {9, 7, 1, 2, 2, 3, 7, 5, 3, 4, 5};
        byte[] pesel2 = {8, 7, 0, 5, 1, 2, 5, 3, 1, 7, 2};
        Sender sender = new Sender("Mike", "Nowak", pesel, "London");
        Sender sender2 = new Sender("Andy", "Jones", pesel2, "Gdansk");


        while (true) {
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
            System.out.println("12. Load container on ship");
            System.out.println("13. Unload container from ship");
            System.out.println("14. Unload container from ship");
            System.out.println("15. Exit");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> shipCount.addShip();
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
                case 14 -> magazine.manuallyUtilizeContainer();
                case 15 -> System.exit(0);
            }
        }
    }
}
