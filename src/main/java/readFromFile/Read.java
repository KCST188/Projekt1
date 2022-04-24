package readFromFile;

import com.google.gson.Gson;
import magazine.Magazine;
import magazine.Train;
import ship.ShipAbstract;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    //Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Gson gson = new Gson();

    public Magazine ReadMagazine() {
        try (FileReader reader = new FileReader("Magazine.txt")) {
            Magazine magazine = gson.fromJson(reader, Magazine.class);
            return magazine;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Train ReadTrain() {
        try (FileReader reader = new FileReader("Train.txt")) {
            Train train = gson.fromJson(reader, Train.class);
            return train;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ShipAbstract ReadShips() {

        try (FileReader reader = new FileReader("Ships.txt")) {
            return gson.fromJson(reader, ShipAbstract.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
