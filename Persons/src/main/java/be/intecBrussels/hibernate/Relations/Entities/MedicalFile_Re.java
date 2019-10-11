package be.intecBrussels.hibernate.Relations.Entities;

import be.intecBrussels.hibernate.Relations.Medical.MedicalFile;
import be.intecBrussels.hibernate.Relations.Medical.Patient;

import javax.persistence.*;

@Entity
public class MedicalFile_Re {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private float height;
    private float weight;

    @OneToOne(mappedBy = "medicalFile")
    private be.intecBrussels.hibernate.Relations.Medical.Patient patient;

    public MedicalFile_Re() {
    }

    public MedicalFile_Re(float height, float weight, be.intecBrussels.hibernate.Relations.Medical.Patient patient) {
        this.height = height;
        this.weight = weight;
        this.patient = patient;
    }

    public be.intecBrussels.hibernate.Relations.Medical.Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "MedicalFile_Re{" +
                "id=" + id +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
