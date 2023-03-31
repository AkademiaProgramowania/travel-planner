package com.travelplanner.travelplanner.model;

public enum Stat {

    CITIZEN_COUNT("mieszkańcy"), WATER_PRICE("woda"), ELECTRICITY_PRICE("prąd"),
    GAS_PRICE("gaz"), AVG_RENT_PRICE("czynsz"), AVG_INCOME_PRICE("zarobki"),
    AVG_LIFE_COSTS_PRICE("wydatki");

    private String inputName;

    Stat(String inputName) {
        this.inputName = inputName;
    }

    public static Stat findByInputName(String input){
        for (Stat stat : values()) {
            if (stat.inputName.equalsIgnoreCase(input)) {
                return stat;
            }
        }
        return null;
    }
}
