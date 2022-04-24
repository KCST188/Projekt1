package container.basic.standard;

import container.LiquidContainerInterface;
import sender.Sender;

public class LiquidsContainerBasic extends StandardContainerBasic implements LiquidContainerInterface {
    public int maxPressure;

    public LiquidsContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, int maxPressure) {
        super(sender, weightBrutto, weightNetto, length, width, height);
        this.maxPressure = maxPressure;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nMax pressure: " + this.maxPressure + "\nExternal material: " + externalMaterial + "\n";
    }
}
