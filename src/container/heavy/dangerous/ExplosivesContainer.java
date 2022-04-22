package container.heavy.dangerous;

import sender.Sender;

public class ExplosivesContainer extends DangerousContainer {
    public int durabilityClass;
    public Boolean isExplosive = true;

    public ExplosivesContainer(Sender sender) {
        super(sender);
        int durabilityClass;
        do {
            System.out.println("Write durability class between 1 and 6");
            durabilityClass = Integer.parseInt(scanner.nextLine());
        } while (durabilityClass < 1 || durabilityClass > 6);
        this.durabilityClass = durabilityClass;
    }


    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nDurability class: " + durabilityClass
                + "\nTime to utilization: " + timeToUtilization();
    }
}
