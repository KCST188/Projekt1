package container.standard;

import sender.Sender;

import java.util.Scanner;

public class HeavyContainer extends StandardContainer {
    public String containerMaterial;

    public HeavyContainer(Sender sender) {
        super(sender);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write container material");
        this.containerMaterial = scanner.nextLine();
        this.isHeavy = true;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\n";
    }
}
