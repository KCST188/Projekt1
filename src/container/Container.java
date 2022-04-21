package container;

import sender.Sender;

import java.io.Serializable;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
    public Boolean isLiquid = false;
    public Boolean isHeavy = false;
    public Boolean isElectric = false;
    public Scanner scanner = new Scanner(System.in);



}
