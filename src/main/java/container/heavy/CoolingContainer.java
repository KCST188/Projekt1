package container.heavy;

import container.standard.HeavyContainer;
import sender.Sender;

import java.util.Scanner;

public class CoolingContainer extends HeavyContainer {
    public int temperatureInside;
    public int voltage;

    public CoolingContainer(Sender sender) {
        super(sender);
        int temperatureInside;
        int voltage;
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Write temperature inside between -30 and 15 C");
                temperatureInside = Integer.parseInt(scanner.nextLine());
            } while (temperatureInside < -30 || temperatureInside > 15);
            this.temperatureInside = temperatureInside;
            do {
                System.out.println("Write voltage between 1500 and 20 000 V");
                voltage = Integer.parseInt(scanner.nextLine());
            } while (voltage < 1500 || voltage > 20000);
            this.voltage = voltage;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        this.isElectric = true;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature inside: " + temperatureInside
                + "C" + "\nVoltage: " + voltage + "\n";
    }
}
