package container;

import java.util.LinkedList;
import java.util.List;

public abstract class Container {
    private int id;
    public String sender;
    public int tara;
    public List<String> security = new LinkedList<>();
    public int weightNetto;
    public int weightBrutto;
    public List<String> certificates = new LinkedList<>();
}
