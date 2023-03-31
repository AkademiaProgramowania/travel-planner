package com.travelplanner.travelplanner.model;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

//Getter wymagany przez Jackson.
@Getter
@ToString
public class Country {
    //Nazwy pól odpowiadają nazwom z Jsona
    private String name;

    Map<Stat, Double> stats = new HashMap<>();

    public Country(String name) {
        this.name = name;
    }

    //Konstruktor wymagany przez Jackson.
    public Country() {

    }

    public void addStat(Stat stat, double value) {
        stats.put(stat, value);
    }
}
