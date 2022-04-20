package container.standard;

import sender.Sender;

public class HeavyContainer extends StandardContainer {
    public String containerMaterial;
    private Boolean isHeavy = true;

    public HeavyContainer(Sender sender) {
        super(sender);
        System.out.println("Write container material");
        this.containerMaterial = scanner.nextLine();
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Netto: " + weightNetto + "\nWeight Brutto: " + weightBrutto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial;
    }
}
