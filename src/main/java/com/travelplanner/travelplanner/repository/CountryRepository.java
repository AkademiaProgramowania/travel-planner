package com.travelplanner.travelplanner.repository;


import com.travelplanner.travelplanner.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {


}
