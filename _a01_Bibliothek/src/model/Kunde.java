package model;

public class Kunde extends Person{
    private String knNr;

    public Kunde(String knNr, String name) {
        super(name);
        this.knNr=knNr;
    }

    public String getKnNr() {
        return knNr;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "knNr='" + knNr + '\'' +
                "} " + super.toString();
    }
}
