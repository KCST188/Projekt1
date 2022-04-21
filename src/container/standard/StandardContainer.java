package container.standard;

import container.Container;
import sender.Sender;

import java.util.concurrent.ThreadLocalRandom;

public class StandardContainer extends Container {
    public int lenght;
    public int width;
    public int height;

    public StandardContainer(Sender sender) {
        this.sender = sender;
        System.out.println("Write weight Brutto");
        this.weightBrutto = Integer.parseInt(scanner.nextLine());
        System.out.println("Write weight Netto");
        this.weightNetto = Integer.parseInt(scanner.nextLine());
        this.tara = weightBrutto - weightNetto;
        this.id = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
        System.out.println("Write lenght");
        this.lenght = Integer.parseInt(scanner.nextLine());
        System.out.println("Write width");
        this.width = Integer.parseInt(scanner.nextLine());
        System.out.println("Write height");
        this.height = Integer.parseInt(scanner.nextLine());
    }


    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\n";
    }

}
