package model;

public class Buch extends Medium{

    private final String isbn;
    public Buch(String isbn,int id, String title) {
        super(id, title);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
