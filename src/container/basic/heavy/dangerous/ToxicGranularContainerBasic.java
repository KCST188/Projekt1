package container.basic.heavy.dangerous;

import sender.Sender;

public class ToxicGranularContainerBasic extends DangerousContainerBasic {
    public int maxGranularWeight;
    public Boolean isToxicGranular = true;

    public ToxicGranularContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial, int maxGranularWeight) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
        this.maxGranularWeight = maxGranularWeight;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nMax granular weight: "
                + this.maxGranularWeight + "\nTime to utilization: " + timeToUtilization();
    }
}
