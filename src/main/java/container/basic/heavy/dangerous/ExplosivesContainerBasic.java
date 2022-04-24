package container.basic.heavy.dangerous;

import container.basic.standard.HeavyContainerBasic;
import magazine.Magazine;
import sender.Sender;

public class ExplosivesContainerBasic extends HeavyContainerBasic {
    public int durabilityClass;

    public ExplosivesContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial, int durabilityClass) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
        this.durabilityClass = durabilityClass;
        this.isExplosive = true;
    }

    public int timeToUtilization() {
        return Magazine.maxTimeExplosives - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nDurability class "
                + this.durabilityClass + "\nDate Arrived: " + dateArrived + "\nTime to utilization: " + timeToUtilization() + "\n";
    }
}
