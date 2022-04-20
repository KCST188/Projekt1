package container.heavy.dangerous;

import container.standard.HeavyContainer;
import sender.Sender;

import java.util.List;

public class ToxicGranularContainer extends DangerousContainer {
    private int maxGranularWeight;
    public Boolean isToxicGranular = true;

    public ToxicGranularContainer(Sender sender) {
        super(sender);
        System.out.println("Write max weight of granular");
        this.maxGranularWeight = Integer.parseInt(scanner.nextLine());
    }

    public String toString(){
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Netto: " + weightNetto + "\nWeight Brutto: " + weightBrutto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nMax granular weight: " + maxGranularWeight;
    }
}
