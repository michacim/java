package model;

public class Address {
    private String city;
    private String postalCode;
    private String street;

    public Address(String city, String postalCode, String street) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;
        return city.equals(address.city) && postalCode.equals(address.postalCode) && street.equals(address.street);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + postalCode.hashCode();
        result = 31 * result + street.hashCode();
        return result;
    }
}
