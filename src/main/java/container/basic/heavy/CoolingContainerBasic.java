package container.basic.heavy;

import container.basic.standard.HeavyContainerBasic;
import sender.Sender;

public class CoolingContainerBasic extends HeavyContainerBasic {
    public int temperatureInside;
    public int voltage;

    public CoolingContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial, int temperatureInside, int voltage) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
        this.temperatureInside = temperatureInside;
        this.voltage = voltage;
        this.isElectric = true;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature inside: " + this.temperatureInside
                + "C" + "\nVoltage: " + this.voltage + "\n";
    }
}
