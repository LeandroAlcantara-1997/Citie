package com.github.LeandroAlcantara1997.citiesapi.repository;

import com.github.LeandroAlcantara1997.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
