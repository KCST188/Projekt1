package container.standard;

import container.LiquidContainerInerface;
import sender.Sender;

public class LiquidsContainer extends StandardContainer implements LiquidContainerInerface {
    public int maxPressure;


    public LiquidsContainer(Sender sender) {
        super(sender);
        System.out.println("Write max pressure");
        this.maxPressure = Integer.parseInt(scanner.nextLine());

    }


    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Netto: " + weightNetto + "\nWeight Brutto: " + weightBrutto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nMax pressure: " + maxPressure + "\nExternal material: " + externalMaterial;
    }
}
