package sender;

import java.io.Serializable;
import java.time.LocalDate;

public class Sender implements Serializable {

    public String name;
    public String surname;
    public byte[] pesel;
    public String address;
    public boolean banned = false;
    public int warning = 0;

    public Sender(String name, String surname, byte[] pesel, String address) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.address = address;
    }

    public LocalDate dateOfBirth() {
        int day;
        int month;
        int year;
        day = 10 * pesel[4];
        day += pesel[5];
        month = 10 * pesel[2];
        month += pesel[3];
        year = 10 * pesel[0];
        year += pesel[1];
        if(year > 4) year += 1900;
        else year += 2000;
        return LocalDate.of(year, month, day);
    }

    public void getBanned(){
        banned = true;
    }
    public void getWarning(){
        warning ++;
    }

    public String toString(){
        return "(Name: " + name + "\nSurname: " + surname + "\nAddress: " + address + "\nDate of birth: " + dateOfBirth() + ")\n";
    }
}
