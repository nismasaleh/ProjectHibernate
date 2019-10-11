package be.intecBrussels.hibernate.Relations.Entities;

import be.intecBrussels.hibernate.Relations.Medical.MedicalFile;
import be.intecBrussels.hibernate.Relations.Medical.Patient;

import javax.persistence.*;

@Entity
public class Patient_Re {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)   // this will give id auto

    private long id;
    private String name;
    @OneToOne
    private MedicalFile medicalFile;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public void setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
    }

    @Override
    public String toString() {
        return "Patient_Re{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", medicalFile=" + medicalFile +
                '}';
    }
}
