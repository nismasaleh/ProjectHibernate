package be.intecBrussels.hibernate.Album;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class AlbumApp {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databig");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Album album = new Album();
        album.setAuthor("Rihanna");
        album.setTitle("Lover");

        List<String> truck = new ArrayList<>();
        truck.add("A");
        truck.add("B");
        truck.add("C");


        album.setTrucks(truck);   // we add the trucks in album


        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(album);
        entityTransaction.commit();
        entityManager.close();
       // entityManager.persist(new Album());


    }
}
