package container.basic.heavy.dangerous;

import container.basic.standard.HeavyContainerBasic;
import magazine.Magazine;
import sender.Sender;

public abstract class DangerousContainerBasic extends HeavyContainerBasic {
    private Boolean isDangerous = true;

    public DangerousContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
    }

    public int timeToUtilization() {
        return Magazine.maxTimeExplosives - daysInMagazine;
    }
}
