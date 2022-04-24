package container.heavy.dangerous;

import container.LiquidContainerInterface;
import container.standard.HeavyContainer;
import magazine.Magazine;
import sender.Sender;

import java.util.Scanner;

public class ToxicLiquidContainer extends HeavyContainer implements LiquidContainerInterface {
    public int temperatureOfLiquid;
    public String liquid;

    public ToxicLiquidContainer(Sender sender) {
        super(sender);
        int temperatureOfLiquid;
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Write temperature of liquid between -10 and 60 C");
                temperatureOfLiquid = Integer.parseInt(scanner.nextLine());
            } while (temperatureOfLiquid < -10 || temperatureOfLiquid > 60);
            this.temperatureOfLiquid = temperatureOfLiquid;
            System.out.println("Write type of liquid");
            this.liquid = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        this.isToxicLiquid = true;
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
