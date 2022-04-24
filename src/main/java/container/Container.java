package container;

import sender.Sender;

import java.time.LocalDate;

public abstract class Container {
    public int id;
    public Sender sender;
    public int weightNetto;
    public int weightBrutto;
    public int tara;
    public int daysInMagazine = 0;
    public Boolean isDangerous = false;
    public Boolean isExplosive = false;
    public Boolean isToxicGranular = false;
    public Boolean isToxicLiquid = false;
    public Boolean isHeavy = false;
    public Boolean isElectric = false;
    public LocalDate dateArrived = null;
    public LocalDate dateUtilize = null;

}
