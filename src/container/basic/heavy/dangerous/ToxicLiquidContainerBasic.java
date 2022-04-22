package container.basic.heavy.dangerous;

import container.LiquidContainerInerface;
import sender.Sender;

public class ToxicLiquidContainerBasic extends DangerousContainerBasic implements LiquidContainerInerface {
    public int temperatureOfLiquid;
    public String liquid;
    public Boolean isToxicLiquid = true;

    public ToxicLiquidContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial, int temperatureOfLiquid, String liquid) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
        this.temperatureOfLiquid = temperatureOfLiquid;
        this.liquid = liquid;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature of liquid: " + temperatureOfLiquid
                + "C" + "\nType of liquid: " + this.liquid + "\nExternal material: " + externalMaterial + "\n";
    }
}
