package container.basic.standard;

import container.LiquidContainerInerface;
import sender.Sender;

public class LiquidsContainerBasic extends StandardContainerBasic implements LiquidContainerInerface {
    public int maxPressure;

    public LiquidsContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, int maxPressure) {
        super(sender, weightBrutto, weightNetto, length, width, height);
        this.maxPressure = maxPressure;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nMax pressure: " + maxPressure + "\nExternal material: " + externalMaterial + "\n";
    }
}
