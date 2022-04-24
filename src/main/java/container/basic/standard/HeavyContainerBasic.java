package container.basic.standard;

import sender.Sender;

public class HeavyContainerBasic extends StandardContainerBasic {
    public String containerMaterial;


    public HeavyContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial) {
        super(sender, weightBrutto, weightNetto, length, width, height);
        this.containerMaterial = containerMaterial;
        this.isHeavy = true;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + this.containerMaterial + "\n";
    }
}
