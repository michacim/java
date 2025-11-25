import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bibliothek bibliothek = new Bibliothek("Bibliothek Berlin");

        Kunde k1 = new Kunde("122212","Max Müller");
        Dvd dvd1 = new Dvd(12,"Sport");


        bibliothek.add(k1);
        bibliothek.add(dvd1);
        Ausleihe a = bibliothek.starteAusleihe(k1,dvd1);
        System.out.println(a);
        //
    }
}