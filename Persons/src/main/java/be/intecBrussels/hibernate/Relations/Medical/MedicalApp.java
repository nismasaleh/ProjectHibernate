package be.intecBrussels.hibernate.Relations.Medical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MedicalApp {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databig");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        MedicalFile medicalFile = new MedicalFile();
        medicalFile.setHeight(50);
        medicalFile.setWeight(100);

        Patient patient = new Patient();
        patient.setName("Nicola");
        patient.setMedicalFile(medicalFile);
        medicalFile.setPatient(patient);



        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(patient);
        entityManager.persist(medicalFile);

        entityTransaction.commit();
        entityManager.close();


    }
}
