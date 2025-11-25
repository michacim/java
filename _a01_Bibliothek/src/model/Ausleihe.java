package model;

public class Ausleihe {
    //FIXME impl
    private Kunde kunde;
    private Medium medium;
    //Datum, aktiv


    public Ausleihe(Kunde kunde, Medium medium) {
        this.kunde = kunde;
        this.medium = medium;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "Ausleihe{" +
                "kunde=" + kunde +
                ", medium=" + medium +
                '}';
    }
}
