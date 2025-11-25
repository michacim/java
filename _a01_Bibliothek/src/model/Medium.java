package model;

public abstract class Medium  implements Ausleihbar{
    private int id;
    private String title;

    private boolean verfuegbar = true;

    public Medium(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVerfuegbar() {
        return verfuegbar;
    }

    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }


    @Override
    public boolean istVerfuegbar() {
        return false;
    }

    @Override
    public boolean ausleihen() {
        this.verfuegbar=false;
        return true;
    }

    @Override
    public boolean zurueckgeben() {
        this.verfuegbar=true;
        return true;
    }
}
