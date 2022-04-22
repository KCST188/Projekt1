package container.standard;

import container.LiquidContainerInerface;
import sender.Sender;

public class LiquidsContainer extends StandardContainer implements LiquidContainerInerface {
    public int maxPressure;


    public LiquidsContainer(Sender sender) {
        super(sender);
        int maxPressure;
        do {
            System.out.println("Write max pressure between 1000 and 5000");
            maxPressure = Integer.parseInt(scanner.nextLine());
        }while (maxPressure < 1000 || maxPressure > 5000) ;
            this.maxPressure = maxPressure;
    }


    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nMax pressure: " + maxPressure + "\nExternal material: " + externalMaterial + "\n";
    }
}
