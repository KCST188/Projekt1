package container.heavy.dangerous;

import container.standard.HeavyContainer;
import magazine.Magazine;
import sender.Sender;

import java.util.Scanner;

public class ExplosivesContainer extends HeavyContainer {
    public int durabilityClass;

    public ExplosivesContainer(Sender sender) {
        super(sender);
        int durabilityClass;
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Write durability class between 1 and 6");
                durabilityClass = Integer.parseInt(scanner.nextLine());
            } while (durabilityClass < 1 || durabilityClass > 6);
            this.durabilityClass = durabilityClass;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        this.isExplosive = true;
    }

    public int timeToUtilization() {
        return Magazine.maxTimeExplosives - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nDurability class: " + durabilityClass
                + "\nTime to utilization: " + timeToUtilization();
    }
}
