package be.intecBrussels.hibernate.Relations.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class School {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;

    @OneToMany
    private List<Student> students = new ArrayList<>();

    public long getId() {
        return id;
    }

    public School setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public School setName(String name) {
        this.name = name;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public School setStudents(List<Student> students) {
        this.students = students;
        return this;
    }
}
