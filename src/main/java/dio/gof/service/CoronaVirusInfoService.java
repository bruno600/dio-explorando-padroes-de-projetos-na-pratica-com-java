package dio.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dio.gof.model.CountryInfo;

@FeignClient(name = "coronavirus19", url = "https://coronavirus-19-api.herokuapp.com/countries")
public interface CoronaVirusInfoService {

//	@GetMapping(value = "/{country}")
	@RequestMapping(method = RequestMethod.GET, value = "/{country}")
	CountryInfo consultarCountry(@PathVariable("country") String country);
}
