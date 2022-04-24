package writeToFile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import magazine.Port;
import sender.SenderCount;
import ship.ShipCount;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void WriteMagazine(Port magazine) {
        try (FileWriter writer = new FileWriter("Magazine.txt")) {
            gson.toJson(magazine, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteTrain(Port train) {
        try (FileWriter writer = new FileWriter("Train.txt")) {
            gson.toJson(train, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteShip(ShipCount shipcount) {
        try (FileWriter writer = new FileWriter("Ships.txt")) {
            gson.toJson(shipcount, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteSeder(SenderCount sendercount) {
        try (FileWriter writer = new FileWriter("Senders.txt")) {
            gson.toJson(sendercount, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
