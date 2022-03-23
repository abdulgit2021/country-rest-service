package com.myCompany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myCompany.model.State;
import com.myCompany.services.StateService;

@RestController
public class CountryController {

	@Autowired
	StateService stateService;

	@GetMapping("/country")
	public String getCountryDetails() {
		return "Country details returned!";
	}

	@PostMapping("/country/state")
	public State addStateDetails(@RequestBody State stateDetails) {

		return stateService.save(stateDetails);
	}

	@PutMapping("/country/state")
	public State updateStateDetails(@RequestBody State stateDetails) {

		return stateService.save(stateDetails);
	}
	
	@DeleteMapping("/country/state/{id}")
	  void delete(@PathVariable Integer id) {
		stateService.deleteById(id);
	  }

}
