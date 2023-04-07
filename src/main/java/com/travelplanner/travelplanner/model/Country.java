package com.travelplanner.travelplanner.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

//Getter wymagany przez Jackson.
@Getter
@ToString
@Entity //Adnotacja Entity oznacza, że klasa ma swoją reprezentację w bazie danych (tabela).
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Nazwy pól odpowiadają nazwom z Jsona
    private String name;

    @ElementCollection()
    @MapKeyEnumerated(EnumType.STRING)
    private Map<Stat, Double> stats = new HashMap<>();

    public Country(String name) {
        this.name = name;
    }

    //Konstruktor wymagany przez Jackson.
    public Country() {

    }

    public void addStat(Stat stat, double value) {
        stats.put(stat, value);
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
