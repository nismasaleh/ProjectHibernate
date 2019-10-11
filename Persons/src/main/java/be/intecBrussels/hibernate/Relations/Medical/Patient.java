package be.intecBrussels.hibernate.Relations.Medical;

import javax.persistence.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)   // this will give id auto

    private long id;
 private String name;
 @OneToOne
 private MedicalFile medicalFile;


    public long getId() {
        return id;
    }

    public Patient setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public Patient setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
        return this;
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
