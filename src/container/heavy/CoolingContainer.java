package container.heavy;

import container.standard.HeavyContainer;
import sender.Sender;

import java.util.List;

public class CoolingContainer extends HeavyContainer {
    public int temperatureInside;
    public int voltage;
    public Boolean isElectric = false;

    public CoolingContainer(Sender sender) {
        super(sender);
        System.out.println("Write temperature inside");
        this.temperatureInside = Integer.parseInt(scanner.nextLine());
        System.out.println("Write voltage");
        this.voltage = Integer.parseInt(scanner.nextLine());
    }

    public String toString(){
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Netto: " + weightNetto + "\nWeight Brutto: " + weightBrutto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature inside: " + temperatureInside
                + "C" + "\nVoltage: " + voltage;
    }
}
