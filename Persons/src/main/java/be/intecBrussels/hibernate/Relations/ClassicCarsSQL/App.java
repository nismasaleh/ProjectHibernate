package be.intecBrussels.hibernate.Relations.ClassicCarsSQL;

import be.intecBrussels.hibernate.Album.Album;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databig");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

       Products p = new Products();

    EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
      //  entityManager.persist(p);
        entityTransaction.commit();
        entityManager.close();
}
}