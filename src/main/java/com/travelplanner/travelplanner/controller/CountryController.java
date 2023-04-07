package com.travelplanner.travelplanner.controller;

import com.travelplanner.travelplanner.model.Country;
import com.travelplanner.travelplanner.service.CountryService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {
    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping("api/v1/countries")
    void createCountry(@RequestBody Country country) {
        countryService.createCountry(country);

    }

    @GetMapping("api/v1/countries")
    ResponseEntity<List<Country>> getCountries() {
        List<Country> countryList = countryService.getCountries();
        return new ResponseEntity<>(countryList, HttpStatusCode.valueOf(200));
    }


}
