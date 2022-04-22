package container.basic.heavy.dangerous;

import sender.Sender;

public class ExplosivesContainerBasic extends DangerousContainerBasic {
    public int durabilityClass;
    public Boolean isExplosive = true;

    public ExplosivesContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial, int durabilityClass) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
        this.durabilityClass = durabilityClass;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nDurability class "
                + this.durabilityClass + "\nTime to utilization: " + timeToUtilization();
    }
}
