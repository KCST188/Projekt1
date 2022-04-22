package container.heavy.dangerous;

import container.LiquidContainerInerface;
import magazine.Magazine;
import sender.Sender;

public class ToxicLiquidContainer extends DangerousContainer implements LiquidContainerInerface {
    public int temperatureOfLiquid;
    public String liquid;
    public Boolean isToxicLiquid = true;

    public ToxicLiquidContainer(Sender sender) {
        super(sender);
        int temperatureOfLiquid;
        do {
            System.out.println("Write temperature of liquid between -10 and 60 C");
            temperatureOfLiquid = Integer.parseInt(scanner.nextLine());
        } while (temperatureOfLiquid < -10 || temperatureOfLiquid > 60);
        this.temperatureOfLiquid = temperatureOfLiquid;
        System.out.println("Write type of liquid");
        this.liquid = scanner.nextLine();


    }

    public int timeToUtilization() {
        return Magazine.maxTimeLiquidToxic - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLength: " + length + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature of liquid: " + temperatureOfLiquid
                + "C" + "\nType of liquid: " + liquid + "\nExternal material: " + externalMaterial + "\nTime to utilization: "
                + timeToUtilization() + "\n";
    }
}
