package entities;


import jakarta.persistence.*;

import java.util.HashSet;

@Entity
@Table(name = "cd")
public class cd{

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String desc;
    private int year;
    private String artist;
    private double price;

    public cd(String title, String desc, int year, String artist, double price) {
        this.title = title;
        this.desc = desc;
        this.year = year;
        this.artist = artist;
        this.price = price;
    }

    @OneToMany
    private HashSet<entities.artist> artists = new HashSet<>();
}
