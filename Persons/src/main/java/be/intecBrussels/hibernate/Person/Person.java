package be.intecBrussels.hibernate.Person;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

@Table(name = "PERSONS", indexes = {@Index(name = "LAST_NAME_INDEX",columnList = "LAST_NAME")
,@Index(columnList = "Birthday")})
@SecondaryTable(name = "URLS")


@Entity
public class Person
{




    @OneToOne
    private Address address;


    public Address getAddress() {
        return address;
    }

    public Person setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "ID")
    private  long id;

    @Version
    @Column (name = "VERSION")
    private  long version;

    @Column(name = "First_Name",length = 40, nullable = false)

    private java.lang.String firstName;

    @Column(name = "LAST_Name",length = 40, nullable = false)
    private java.lang.String lastName;

    @Column(name = "BIRTHDAY")
    private LocalDate birthday;

   @Column(name = "GENDER")
   @Enumerated(EnumType.STRING)
    private GenderType gender;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "PICTURE")
    private  byte[] picture;

    @Column(name = "COMMENT")
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String comment;


       @Column(name = "MARRIED")
     //or
   // @Column(name = "MARRIED",columnDefinition = "BOOLEAN")

    private  boolean married;

   //@Column(name = "AGE")
    private  int age;

    //@SecondaryTable(name = "URLS")
    @Column(name ="HOMEPAGE", table = "URLS")
    private String homepage;

    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(Address address, long version, String firstName, String lastName, LocalDate birthday, GenderType gender, byte[] picture, String comment, boolean married, int age, String homepage) {
        this.address = address;
        this.version = version;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.picture = picture;
        this.comment = comment;
        this.married = married;
        this.age = age;
        this.homepage = homepage;
    }

    public Person(long version, String firstName, String lastName, LocalDate birthday, GenderType gender, String comment, boolean married, int age) {
        this();

        this.version = version;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.comment = comment;
        this.married = married;
        this.age = age;
    }


    public Person(String firstName, String lastName, GenderType gender, boolean married, int age) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.married = married;
        this.age = age;
    }

    public long getVersion() {
        return version;
    }

    public Person setVersion(long version) {
        this.version = version;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public GenderType getGender() {
        return gender;
    }

    public Person setGender(GenderType gender) {
        this.gender = gender;
        return this;
    }


/*
    public Person setPicture(byte[] picture) {
        this.picture = picture;
        return this;
    }

    public byte[] getPicture() {
        return picture;
    }
*/

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;

    }

    public String getComment() {
        return comment;
    }

    public Person setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public boolean isMarried() {
        return married;
    }

    public Person setMarried(boolean married) {
        this.married = married;
        return this;
    }

    // here is
   //  @Transient

    @Column(name = "AGE")
    public int getAge() {
        return Period.between(birthday,LocalDate.now()).getYears();
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getHomepage() {
        return homepage;
    }

    public Person setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", id=" + id +
                ", version=" + version +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", picture=" + Arrays.toString(picture) +
                ", comment='" + comment + '\'' +
                ", married=" + married +
                ", age=" + age +
                ", homepage='" + homepage + '\'' +
                '}';
    }
}
