package model;

public class Customer extends Person{ //Customer is Person

    private int id;


    public Customer(int id, String firstname, String lastname) {
        super(firstname, lastname);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                "} " + super.toString();
    }
}
