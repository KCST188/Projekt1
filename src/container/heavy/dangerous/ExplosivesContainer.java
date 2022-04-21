package container.heavy.dangerous;

import magazine.Magazine;
import sender.Sender;

public class ExplosivesContainer extends DangerousContainer {
    public int durabilityClass;
    public Boolean isExplosive = true;

    public ExplosivesContainer(Sender sender) {
        super(sender);
        System.out.println("Write durability class");
        this.durabilityClass = Integer.parseInt(scanner.nextLine());
    }

    public int timeToUtilzation() {
        return Magazine.maxTimeExplosives - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nDurability class: " + durabilityClass
                + "\nTime to utilization: " + timeToUtilzation() + "\n";
    }
}
