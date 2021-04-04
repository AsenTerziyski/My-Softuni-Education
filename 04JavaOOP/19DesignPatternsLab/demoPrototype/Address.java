package demoPrototype;

public class Address implements Clone<Address> {
    private String firstName;
    private String secondName;
    private String email;
    private String phone;
    private String city;
    private String country;
    private String state;
    private String line1;
    private String line2;
    private String postalCode;

    public Address(String firstName,
                   String secondName,
                   String email,
                   String phone,
                   String city,
                   String country,
                   String state,
                   String line1,
                   String line2,
                   String postalCode) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.state = state;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "demoPrototype.Address{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public Address clone() {
        return new Address(firstName, secondName, email, phone, city, country, state, line1, line2, postalCode);
    }
}
