package com.compositekey.sample.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compositekey.sample.model.Company;
import com.compositekey.sample.service.CompanyService;


@RestController
@RequestMapping("/api/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@PostMapping("/new")
	public ResponseEntity<Company> createCompany(@RequestBody Company company) {

		Company newCompany = companyService.createCompany(company);

		return ResponseEntity.ok(newCompany);
	}

	@GetMapping("/")
	public ResponseEntity<List<Company>> getAllCompanies() {

		List<Company> companies = companyService.getAllCompanies();

		return ResponseEntity.ok(companies);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<Company> getCampany(@PathVariable("id") String id) {

		Company company = companyService.getCampany(id);

		return ResponseEntity.ok(company);
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<Company> updateUser(@RequestBody Company user, @PathVariable("id") String id) {

		Company newUser = companyService.updateCompany(user, id);

		return ResponseEntity.ok(newUser);
	}

	@DeleteMapping("/tenantrequest/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") String id) {

		companyService.deleteCompany(id);

		return ResponseEntity.ok("");
	}

}
