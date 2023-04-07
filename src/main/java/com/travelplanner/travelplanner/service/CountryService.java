package com.travelplanner.travelplanner.service;

import com.travelplanner.travelplanner.model.Country;
import com.travelplanner.travelplanner.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public void createCountry(Country country) {
        countryRepository.save(country);
        System.out.println(country);
    }



}
