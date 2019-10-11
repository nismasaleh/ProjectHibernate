package be.intecBrussels.hibernate.Person;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public Address setId(int id) {
        this.id = id;
        return this;
    }



    @Column(name = "STREET")
    private String street;

    @Column(name = "NUMBER")
    private int number;

    @Column(name = "CONTRY")
    private String contry;

    @Column(name = "CITY")
    private String city;

    @Column(name = "ZIP")
    private int zip;

    @OneToOne(mappedBy = "address")
    private Person person;

    public Address() {
    }

    public Address(String street, int number, String contry, String city, int zip, Person person) {
        this.street = street;
        this.number = number;
        this.contry = contry;
        this.city = city;
        this.zip = zip;
        this.person = person;
    }

    public Address(String street) {
        this.street = street;
    }

    public Person getPerson() {
        return person;
    }

    public Address setPerson(Person person) {
        this.person = person;
        return this;
    }

    public Address(Person p) {
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Address setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getContry() {
        return contry;
    }

    public Address setContry(String contry) {
        this.contry = contry;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public int getZip() {
        return zip;
    }

    public Address setZip(int zip) {
        this.zip = zip;
        return this;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", contry='" + contry + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", person=" + person +
                '}';
    }
}
