package container.standard;

import container.Container;
import sender.Sender;

import java.util.List;
import java.util.Scanner;

public class StandardContainer extends Container {
    public int lenght;
    public int width;
    public int height;

    public StandardContainer(Sender sender) {
        super(sender);
        System.out.println("Write lenght");
        this.lenght = Integer.parseInt(scanner.nextLine());
        System.out.println("Write width");
        this.width = Integer.parseInt(scanner.nextLine());
        System.out.println("Write height");
        this.height = Integer.parseInt(scanner.nextLine());
    }


    public String toString(){
        return "Id: " + id + "\nSender: " + sender.toString() + "Weight Netto: " + weightNetto + "\nWeight Brutto: " + weightBrutto
                + "\nTara: " + tara + "\nDays in magazine: " + daysInMagazine + "\nLenght: " + lenght + "\nWidth: " + width
                + "\nHeight: " + height;
    }

}
