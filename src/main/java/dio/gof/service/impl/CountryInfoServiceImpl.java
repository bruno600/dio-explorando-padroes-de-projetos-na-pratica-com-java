package dio.gof.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.gof.model.CountryInfo;
import dio.gof.service.CoronaVirusInfoService;

@Service
public class CountryInfoServiceImpl {
	
	@Autowired
	CoronaVirusInfoService countryInfo;
	
	public CountryInfo consultarCountry(String country) {
		return countryInfo.consultarCountry(country);
	}
}
