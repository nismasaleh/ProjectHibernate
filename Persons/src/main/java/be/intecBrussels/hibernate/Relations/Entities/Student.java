package be.intecBrussels.hibernate.Relations.Entities;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

   // @ManyToOne    // here if i do not use it will show student_school (intermediate)and do not need for mobed by in the other class
   //private School school;

    public long getId() {
        return id;
    }

    public Student setId(long id) {
        this.id = id;
        return this;
    }


}
