package writeToFile;

import magazine.Port;
import sender.Sender;
import sender.SenderCount;
import ship.Ship;
import ship.ShipAbstract;
import ship.ShipBasic;
import ship.ShipCount;

import java.io.*;

public class Write {
    public void WriteMagazine(Port magazine) {
        try {
            FileOutputStream f = new FileOutputStream(new File("Magazine.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(magazine);

            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public void WriteTrain(Port train) {
        try {
            FileOutputStream f = new FileOutputStream(new File("Train.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(train);

            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public void WriteShip(ShipCount shipcount) {
        try {
            FileOutputStream f = new FileOutputStream(new File("Ships.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            for (ShipAbstract ship: shipcount.ships) {
                o.writeObject(ship);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public void WriteSeder(SenderCount sendercount) {
        try {
            FileOutputStream f = new FileOutputStream(new File("Senders.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            for (Sender sender: sendercount.senders) {
                o.writeObject(sender);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
}
