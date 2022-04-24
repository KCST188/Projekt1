package container.standard;

import container.Container;
import sender.Sender;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StandardContainer extends Container {
    public int length;
    public int width;
    public int height;

    public StandardContainer(Sender sender) {
        this.sender = sender;
        int weightBrutto;
        int weightNetto;
        int length;
        int width;
        int height;
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Write weight Brutto between 800 and 4000 kg");
                weightBrutto = Integer.parseInt(scanner.nextLine());
            } while (weightBrutto < 800 || weightBrutto > 4000);
            this.weightBrutto = weightBrutto;
            do {
                System.out.println("Write weight Netto larger than 600 kg and smaller than weight Brutto: " + this.weightBrutto);
                weightNetto = Integer.parseInt(scanner.nextLine());
            } while (weightNetto < 600 || this.weightBrutto < weightNetto);
            this.weightNetto = weightNetto;
            this.tara = weightBrutto - weightNetto;
            do {
                System.out.println("Write length between 8 and 20 m");
                length = Integer.parseInt(scanner.nextLine());
            } while (length < 8 || length > 20);
            this.length = length;
            do {
                System.out.println("Write width between 1 and 6 m");
                width = Integer.parseInt(scanner.nextLine());
            } while (width < 1 || width > 6);
            this.width = width;
            do {
                System.out.println("Write height between 1 and 4 m");
                height = Integer.parseInt(scanner.nextLine());
            } while (height < 1 || height > 4);
            this.height = height;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        this.id = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\n";
    }

}
