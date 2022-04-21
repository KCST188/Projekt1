package container.basic.heavy.dangerous;

import container.LiquidContainerInerface;
import sender.Sender;

public class ToxicLiquidContainerBasic extends DangerousContainerBasic implements LiquidContainerInerface {
    public int temperatureOfLiquid;
    public String internalMaterial;
    public Boolean isToxicLiquid = true;

    public ToxicLiquidContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial, int temperatureOfLiquid, String internalMaterial) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
        this.temperatureOfLiquid = temperatureOfLiquid;
        this.internalMaterial = internalMaterial;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature of liquid: " + temperatureOfLiquid
                + "C" + "\nInternal material: " + internalMaterial + "\nExternal material: " + externalMaterial + "\n";
    }
}
