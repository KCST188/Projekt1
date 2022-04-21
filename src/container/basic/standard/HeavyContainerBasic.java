package container.basic.standard;

import sender.Sender;

public class HeavyContainerBasic extends StandardContainerBasic {
    public String containerMaterial;
    private Boolean isHeavy = true;

    public HeavyContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial) {
        super(sender, weightBrutto, weightNetto, length, width, height);
        this.containerMaterial = containerMaterial;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\n";
    }
}
