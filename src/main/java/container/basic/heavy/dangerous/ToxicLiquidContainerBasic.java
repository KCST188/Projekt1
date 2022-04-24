package container.basic.heavy.dangerous;

import container.LiquidContainerInterface;
import container.basic.standard.HeavyContainerBasic;
import magazine.Magazine;
import sender.Sender;

public class ToxicLiquidContainerBasic extends HeavyContainerBasic implements LiquidContainerInterface {
    public int temperatureOfLiquid;
    public String liquid;

    public ToxicLiquidContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial, int temperatureOfLiquid, String liquid) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
        this.temperatureOfLiquid = temperatureOfLiquid;
        this.liquid = liquid;
        this.isToxicLiquid = true;
    }

    public int timeToUtilization() {
        return Magazine.maxTimeLiquidToxic - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature of liquid: " + temperatureOfLiquid
                + "C" + "\nType of liquid: " + this.liquid + "\nExternal material: " + externalMaterial
                + "\nDate Arrived: " + dateArrived + "\nTime to utilization: " + timeToUtilization();
    }
}
