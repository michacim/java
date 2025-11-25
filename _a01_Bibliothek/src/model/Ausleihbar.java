package model;

public interface Ausleihbar {
    boolean istVerfuegbar();

    boolean ausleihen();

    boolean zurueckgeben();
}
