package com.luxoft.springdb.lab3.service;

import com.luxoft.springdb.lab3.model.Country;
import org.springframework.transaction.annotation.Propagation;

import java.util.List;

public interface CountryService {
    List<Country> getAllCountriesInsideTransaction(Propagation propagation);
    List<Country> getAllCountriesRequired();
    List<Country> getAllCountriesRequiresNew();
    List<Country> getAllCountriesSupports();
    List<Country> getAllCountriesNever();
    List<Country> getAllCountriesMandatory();
    List<Country> getAllCountriesNotSupported();
    List<Country> getAllCountries();
}
