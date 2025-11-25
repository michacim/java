package model;

import java.io.Serializable;
import java.util.Objects;

public class Person extends AbstractPerson implements Serializable {//Serializable: Marker-Interface

    private String firstname;
    private String lastname;
    private Address address;// Assoziation


    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstname);
        result = 31 * result + Objects.hashCode(lastname);
        return result;
    }

    @Override
    public void info(String msg) {
        System.out.println(lastname);
    }
}
