package be.intecBrussels.hibernate.Person;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class PersonApp {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databig");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

      //  entityManager.persist(new Person(100,"fara","saed",LocalDate.of(1986,01,27), GenderType.SHE_WOMAN,"non", true,20));



        Person p = new Person();
        p.setVersion(006L);
        p.setFirstName("Nisma");
        p.setLastName("Alaklouk");
        p.setGender(GenderType.SHE_WOMAN);
        p.setMarried(true);
        p.setComment("no");
        p.setHomepage("https://nisma.home.blog");
        p.setBirthday(LocalDate.of(1986, 01, 27));
        p.setPicture(getPictureFromURL("C://Users/nismaa/photo/1.jpg"));
        Address a = new Address();
        a.setStreet("Rue des");
        a.setNumber(7);
        a.setCity("brussels");
        a.setZip(1080);
        a.setContry("Bel");

        p.setAddress(a);     //here ae should add the address on the person
        a.setPerson(p);


        entityManager.persist(p);
        entityManager.persist(a);
        System.out.println(p.getAge());
        entityTransaction.commit();
        entityManager.close();
    }

    private static byte[] getPictureFromURL(String location) {
        Path p = Paths.get(location);
        byte[] bytes = null;


        try {
            bytes = Files.readAllBytes(p);
        } catch (IOException e) {
            e.getStackTrace();
        }
        return bytes;
    }
}
