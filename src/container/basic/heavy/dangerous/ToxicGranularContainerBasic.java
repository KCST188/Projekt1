package container.basic.heavy.dangerous;

import container.basic.standard.HeavyContainerBasic;
import magazine.Magazine;
import sender.Sender;

public class ToxicGranularContainerBasic extends HeavyContainerBasic {
    public int maxGranularWeight;

    public ToxicGranularContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial, int maxGranularWeight) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
        this.maxGranularWeight = maxGranularWeight;
        this.isToxicGranular = true;
    }

    public int timeToUtilization() {
        return Magazine.maxTimeGranularToxic - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nMax granular weight: "
                + this.maxGranularWeight + "\nTime to utilization: " + timeToUtilization();
    }
}
