package com.github.LeandroAlcantara1997.citiesapi.countries.repository;

import com.github.LeandroAlcantara1997.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
