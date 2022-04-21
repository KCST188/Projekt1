package container.heavy.dangerous;

import container.LiquidContainerInerface;
import magazine.Magazine;
import sender.Sender;

public class ToxicLiquidContainer extends DangerousContainer implements LiquidContainerInerface {
    public int temperatureOfLiquid;
    public String internalMaterial;
    public Boolean isToxicLiquid = true;

    public ToxicLiquidContainer(Sender sender) {
        super(sender);
        System.out.println("Write temperature of liquid");
        this.temperatureOfLiquid = Integer.parseInt(scanner.nextLine());
        System.out.println("Write internal material");
        this.internalMaterial = scanner.nextLine();
    }

    public int timeToUtilzation(){
        return Magazine.maxTimeLiquidToxic - daysInMagazine;
    }

    public String toString() {
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Brutto: " + weightBrutto + "\nWeight Netto: " + weightNetto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature of liquid: " + temperatureOfLiquid
                + "C" + "\nInternal material: " + internalMaterial + "\nExternal material: " + externalMaterial + "\nTime to utilization: "
                + timeToUtilzation() + "\n";
    }
}
