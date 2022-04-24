package container.standard;

import container.LiquidContainerInterface;
import sender.Sender;

import java.util.Scanner;

public class LiquidsContainer extends StandardContainer implements LiquidContainerInterface {
    public int maxPressure;


    public LiquidsContainer(Sender sender) {
        super(sender);
        int maxPressure;
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Write max pressure between 1000 and 5000");
                maxPressure = Integer.parseInt(scanner.nextLine());
            } while (maxPressure < 1000 || maxPressure > 5000);
            this.maxPressure = maxPressure;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }


    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nMax pressure: " + maxPressure + "\nExternal material: " + externalMaterial + "\n";
    }
}
