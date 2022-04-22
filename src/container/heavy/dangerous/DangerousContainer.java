package container.heavy.dangerous;

import container.standard.HeavyContainer;
import magazine.Magazine;
import sender.Sender;

public abstract class DangerousContainer extends HeavyContainer {
    private Boolean isDangerous = true;

    public DangerousContainer(Sender sender) {
        super(sender);
    }

    public int timeToUtilization() {
        return Magazine.maxTimeExplosives - daysInMagazine;
    }
}
