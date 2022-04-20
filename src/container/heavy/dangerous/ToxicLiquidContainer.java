package container.heavy.dangerous;

import container.LiquidContainerInerface;
import sender.Sender;

public class ToxicLiquidContainer extends DangerousContainer implements LiquidContainerInerface {
    private int temperatureOfLiquid;
    public String internalMaterial;
    public Boolean isToxicLiquid = true;

    public ToxicLiquidContainer(Sender sender) {
        super(sender);
        System.out.println("Write temperature of liquid");
        this.temperatureOfLiquid = Integer.parseInt(scanner.nextLine());
        System.out.println("Write internal material");
        this.internalMaterial = scanner.nextLine();
    }

    public String toString(){
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Netto: " + weightNetto + "\nWeight Brutto: " + weightBrutto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height + "\nContainer material: " + containerMaterial + "\nTemperature of liquid: " + temperatureOfLiquid
                + "C" + "\nInternal material: " + internalMaterial + "\nExternal material: " + externalMaterial;
    }
}
