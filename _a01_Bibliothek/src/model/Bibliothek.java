package model;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {

    private String name;
    private List<Medium> medien = new ArrayList<>();
    private List<Kunde> kunden = new ArrayList<>();
    private List<Ausleihe> ausleihen = new ArrayList<>();

    public Bibliothek(String name) {
        this.name = name;
    }

    public void add(Medium medium){
        medien.add(medium);
    }

    public void add(Kunde kunde){
        kunden.add(kunde);
    }

    public Ausleihe starteAusleihe(Kunde kunde, Medium ausleihbar){
        Ausleihe a = new Ausleihe(kunde,ausleihbar);
        ausleihen.add(a);
        System.out.println("Ausleihe: "+kunde+" "+ausleihbar);
        return a;
    }

}
