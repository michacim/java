import model.Address;
import model.Person;

import java.io.Serializable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    /*
    Beispiel für verwendung von Marker-Interfaces (Serializable)
     */
    public static void send(Object obj){

        if(!(obj instanceof Serializable)){
            throw new RuntimeException("nicht geeignet");
        }
        System.out.println("Objekt wird gesendet...");

    }
    public static void main(String[] args) {
        Person p1 =new Person("Max","Müller");
        Person p2 = new Person("Max","Müller");
        System.out.println(p1.equals(p2));


        p1.setAddress(new Address("Berlin","12222","Dorfstr. 3"));

        System.out.println(p1.getAddress().getPostalCode());

        send(new Address("Berlin","12222","Dorfstr. 3"));//nicht geeignet

    }
}