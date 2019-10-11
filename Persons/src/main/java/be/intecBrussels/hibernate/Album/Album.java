package be.intecBrussels.hibernate.Album;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;


   @Column(name = "Title")
    private String title;
   @Column(name = "Author")
    private String author;

    @ElementCollection
   private List<String> trucks = new ArrayList<>();


    public long getId() {
        return id;
    }

    public Album setId(long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Album setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Album setAuthor(String author) {
        this.author = author;
        return this;
    }

    public List<String> getTrucks() {
        return trucks;
    }

    public void setTrucks(List<String> trucks) {
        this.trucks = trucks;
       // return this;  // if Album instead of void i could use it
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", trucks=" + trucks +
                '}';
    }
}
