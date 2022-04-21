package container.heavy.dangerous;

import magazine.Magazine;
import sender.Sender;

public class ToxicGranularContainer extends DangerousContainer {
    public int maxGranularWeight;
    public Boolean isToxicGranular = true;

    public ToxicGranularContainer(Sender sender) {
        super(sender);
        System.out.println("Write max weight of granular");
        this.maxGranularWeight = Integer.parseInt(scanner.nextLine());
    }

    public int timeToUtilzation() {
        return Magazine.maxTimeGranularToxic - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nMax granular weight: " + maxGranularWeight
                + "\nTime to utilization: " + timeToUtilzation() + "\n";
    }
}
