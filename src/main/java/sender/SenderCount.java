package sender;

import java.io.Serializable;
import java.util.ArrayList;

public class SenderCount implements Serializable {
    public ArrayList<Sender> senders = new ArrayList<>();

    public Sender findSenderByName(String name) {
        for (Sender sender : senders) {
            if (sender.name.equals(name)) return sender;
        }
        return null;
    }
}
