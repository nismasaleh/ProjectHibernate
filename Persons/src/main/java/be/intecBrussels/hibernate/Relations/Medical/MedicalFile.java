package be.intecBrussels.hibernate.Relations.Medical;

import javax.persistence.*;

@Entity
public class MedicalFile {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private float height;
    private float weight;

    @OneToOne(mappedBy = "medicalFile")
    private Patient patient;

    public MedicalFile() {
    }

    public MedicalFile(float height, float weight, Patient patient) {
        this.height = height;
        this.weight = weight;
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public MedicalFile setPatient(Patient patient) {
        this.patient = patient;
        return this;
    }

    public long getId() {
        return id;
    }

    public MedicalFile setId(long id) {
        this.id = id;
        return this;
    }



    public float getHeight() {
        return height;
    }

    public MedicalFile setHeight(float height) {
        this.height = height;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public MedicalFile setWeight(float weight) {
        this.weight = weight;
        return this;
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
