package container;

import sender.Sender;

import java.io.Serializable;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Container implements Serializable {
    public int id;
    public Sender sender;
    public int weightNetto;
    public int weightBrutto;
    public int tara;
    public int daysInMagazine = 0;
    public Boolean isDangerous = false;
    public Boolean isExplosive = false;
    public Boolean isToxicGranular = false;
    public Boolean isToxicLiquid = false;
    public Boolean isLiquid = false;
    public Boolean isHeavy = false;
    public Boolean isElectric = false;
    public Scanner scanner = new Scanner(System.in);

    public Container(Sender sender) {
        this.sender = sender;

        System.out.println("Write weight Brutto");
        int weightBrutto = Integer.parseInt(scanner.nextLine());

        System.out.println("Write weight Netto");
        int weightNetto = Integer.parseInt(scanner.nextLine());

        this.weightNetto = weightNetto;
        this.weightBrutto = weightBrutto;
        this.tara = weightBrutto - weightNetto;
        this.id = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
    }


    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Netto: " + weightNetto + "\nWeight Brutto" + weightBrutto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine;
    }
}
