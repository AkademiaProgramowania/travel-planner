package com.travelplanner.travelplanner.controller;

import com.travelplanner.travelplanner.model.Country;
import com.travelplanner.travelplanner.service.CountryService;
import org.springframework.web.bind.annotation.*;

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


}
