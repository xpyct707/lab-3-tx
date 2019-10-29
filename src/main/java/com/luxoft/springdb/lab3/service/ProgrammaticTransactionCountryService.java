package com.luxoft.springdb.lab3.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;

import com.luxoft.springdb.lab3.dao.CountryDao;
import com.luxoft.springdb.lab3.dao.CountryNotFoundException;
import com.luxoft.springdb.lab3.model.Country;

public interface ProgrammaticTransactionCountryService {
    Country getCountryByName(String name) throws CountryNotFoundException;
    List<Country> getAllCountries();
    Country getCountryByCodeName(String codeName, Propagation propagation);
}
