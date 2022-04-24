package container.heavy.dangerous;

import container.standard.HeavyContainer;
import magazine.Magazine;
import sender.Sender;

import java.util.Scanner;

public class ToxicGranularContainer extends HeavyContainer {
    public int maxGranularWeight;

    public ToxicGranularContainer(Sender sender) {
        super(sender);
        int maxGranularWeight;
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Write max weight of granular between weight netto: " + this.weightNetto + " and 40% of that: " + 0.4*this.weightNetto);
                maxGranularWeight = Integer.parseInt(scanner.nextLine());
            } while (maxGranularWeight < 0.4 * weightNetto || maxGranularWeight > weightNetto);
            this.maxGranularWeight = maxGranularWeight;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        this.isToxicGranular = true;
    }

    public int timeToUtilization() {
        return Magazine.maxTimeGranularToxic - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nMax granular weight: " + maxGranularWeight
                + "\nTime to utilization: " + timeToUtilization() + "\n";
    }
}
