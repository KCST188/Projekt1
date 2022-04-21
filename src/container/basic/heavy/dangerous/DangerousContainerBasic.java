package container.basic.heavy.dangerous;

import container.basic.standard.HeavyContainerBasic;
import sender.Sender;

public abstract class DangerousContainerBasic extends HeavyContainerBasic {
    private Boolean isDangerous = true;

    public DangerousContainerBasic(Sender sender, int weightBrutto, int weightNetto, int length, int width, int height, String containerMaterial) {
        super(sender, weightBrutto, weightNetto, length, width, height, containerMaterial);
    }
}
