package com.travelplanner.travelplanner.controller;

import com.travelplanner.travelplanner.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.travelplanner.travelplanner.model.Stat;

@RestController
public class MediaController {
//    Country country1 = new Country("Poland");
//        country1.addStat(Stat.CITIZEN_COUNT, 37_000_000);
//        country1.addStat(Stat.AVG_LIFE_COSTS_PRICE, 4000);
//        country1.addStat(Stat.AVG_INCOME_PRICE, 6200);
//        country1.addStat(Stat.AVG_RENT_PRICE, 1600);
//        country1.addStat(Stat.ELECTRICITY_PRICE, 100);
//        country1.addStat(Stat.WATER_PRICE, 50);
//        country1.addStat(Stat.GAS_PRICE, 100);
//    //Niemcy
//    Country country2 = new Country("Germany");
//        country2.addStat(Stat.CITIZEN_COUNT, 83_200_000);
//        country2.addStat(Stat.AVG_LIFE_COSTS_PRICE, 1000);
//        country2.addStat(Stat.AVG_INCOME_PRICE, 4105);
//        country2.addStat(Stat.AVG_RENT_PRICE, 500);
//        country2.addStat(Stat.ELECTRICITY_PRICE, 20);
//        country2.addStat(Stat.WATER_PRICE, 10);
//        country2.addStat(Stat.GAS_PRICE, 15);


    @GetMapping("country")
    String getCountry() {
        return "Poland";
    }

    @GetMapping("country2")
    ResponseEntity<Country> getCountry2() {


        return new ResponseEntity<>(createCountry(), HttpStatusCode.valueOf(200));
    }

    /* 100+ => info
    200+ => ok, sukces
    300+ => redirect, przekierowania
    400+ => client error
    500+ => server error
     */

    @GetMapping("country3")
    @ResponseStatus(code = HttpStatus.OK)
    Country getCountry3() {

        return createCountry();
    }


    private Country createCountry() {
        Country country1 = new Country("Poland");
        country1.addStat(Stat.CITIZEN_COUNT, 37_000_000);
        country1.addStat(Stat.AVG_LIFE_COSTS_PRICE, 4000);
        country1.addStat(Stat.AVG_INCOME_PRICE, 6200);
        country1.addStat(Stat.AVG_RENT_PRICE, 1600);
        country1.addStat(Stat.ELECTRICITY_PRICE, 100);
        country1.addStat(Stat.WATER_PRICE, 50);
        country1.addStat(Stat.GAS_PRICE, 100);
        return country1;
    }
}
