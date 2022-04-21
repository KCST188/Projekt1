package container.basic.standard;

import container.Container;
import sender.Sender;

import java.util.concurrent.ThreadLocalRandom;

public class StandardContainerBasic extends Container {
    public int lenght;
    public int width;
    public int height;

    public StandardContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height) {
        this.sender = sender;
        this.weightBrutto = weightBrutto;
        this.weightNetto = weightNetto;
        this.tara = weightBrutto - weightNetto;
        this.id = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
        this.lenght = length;
        this.width = width;
        this.height = height;
    }


    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\n";
    }
}
