package be.intecBrussels.hibernate.Relations.Entities;

import be.intecBrussels.hibernate.Relations.Entities.Student;
import be.intecBrussels.hibernate.Relations.Medical.MedicalFile;
import be.intecBrussels.hibernate.Relations.Medical.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RelationApp {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databig");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        MedicalFile medicalFile = new MedicalFile();


        Patient patient = new Patient();

        Student student = new Student();

        School s = new School();
        s.setName("Bruss");


        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(patient);
        entityManager.persist(medicalFile);
        entityManager.persist(student);


        entityTransaction.commit();
        entityManager.close();

    }
}