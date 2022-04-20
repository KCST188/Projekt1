package container.heavy.dangerous;

import container.standard.HeavyContainer;
import sender.Sender;

import java.util.List;

public class ExplosivesContainer extends DangerousContainer {
    private int durabilityClass;
    public Boolean isExplosive = true;

    public ExplosivesContainer(Sender sender) {
        super(sender);
        System.out.println("Write durability class");
        this.durabilityClass = Integer.parseInt(scanner.nextLine());
    }

    public String toString(){
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Netto: " + weightNetto + "\nWeight Brutto: " + weightBrutto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nDurability class " + durabilityClass;
    }
}
