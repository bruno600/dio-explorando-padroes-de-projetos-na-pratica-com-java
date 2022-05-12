package dio.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.gof.model.CountryInfo;
import dio.gof.service.impl.CountryInfoServiceImpl;

@RestController
@RequestMapping(value = "corona")
public class CountryInfoController {

	@Autowired
	private CountryInfoServiceImpl service;
	
	@GetMapping("/{country}")
	public ResponseEntity<CountryInfo> getInfo(@PathVariable String country) {
		return ResponseEntity.ok(service.consultarCountry(country));
	}
}
