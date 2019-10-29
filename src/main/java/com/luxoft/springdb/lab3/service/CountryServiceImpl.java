package com.luxoft.springdb.lab3.service;

import com.luxoft.springdb.lab3.dao.CountryDao;
import com.luxoft.springdb.lab3.model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository is more convenient declaration for such a class than general @Service
@Repository
@RequiredArgsConstructor
@Transactional
public class CountryServiceImpl implements CountryService {
	private final CountryDao countryDao;


	public List<Country> getAllCountriesInsideTransaction(Propagation propagation) {
		switch (propagation) {
			case REQUIRED:
				return getAllCountriesRequired();
			case REQUIRES_NEW:
				return getAllCountriesRequiresNew();
			case SUPPORTS:
				return getAllCountriesSupports();
			case NEVER:
				return getAllCountriesNever();
			case MANDATORY:
				return getAllCountriesMandatory();
			case NOT_SUPPORTED:
				return getAllCountriesNotSupported();
			case NESTED:
				return getAllCountriesNested();
			default:
				return getAllCountries();
		}
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public List<Country> getAllCountriesRequired() {
		return countryDao.getCountryList();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Country> getAllCountriesRequiresNew() {
		return countryDao.getCountryList();
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Country> getAllCountriesSupports() {
		return countryDao.getCountryList();
	}

	@Transactional(propagation = Propagation.NEVER)
	public List<Country> getAllCountriesNever() {
		return countryDao.getCountryList();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public List<Country> getAllCountriesMandatory() {
		return countryDao.getCountryList();
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Country> getAllCountriesNotSupported() {
		return countryDao.getCountryList();
	}

	@Transactional(propagation = Propagation.NESTED)
	public List<Country> getAllCountriesNested() {
		return countryDao.getCountryList();
	}

	@Transactional(propagation = Propagation.NESTED)
	public List<Country> getAllCountries() {
		return countryDao.getCountryList();
	}
}