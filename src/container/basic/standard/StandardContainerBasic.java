package container.basic.standard;

import container.Container;
import sender.Sender;

import java.util.concurrent.ThreadLocalRandom;

public class StandardContainerBasic extends Container {
    public int length;
    public int width;
    public int height;

    public StandardContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height) {
        this.sender = sender;
        this.weightBrutto = weightBrutto;
        this.weightNetto = weightNetto;
        this.tara = weightBrutto - weightNetto;
        this.id = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public String toString() {
        return "Id: " + this.id + "\nSender: " + this.sender.toString() + "Weight Brutto: " + this.weightBrutto + "\nWeight Netto: "
                + this.weightNetto + "\nTara: " + this.tara + "\nDays in magazine: " + this.daysInMagazine + "\nLength: "
                + this.length + "\nWidth: " + this.width + "\nHeight: " + this.height + "\n";
    }
}
