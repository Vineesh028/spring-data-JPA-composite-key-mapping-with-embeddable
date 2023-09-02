package com.compositekey.sample.service;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compositekey.sample.entity.CompanyEntity;
import com.compositekey.sample.entity.EmployeeEntity;
import com.compositekey.sample.model.Company;
import com.compositekey.sample.repository.CompanyRepository;




@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private ModelMapper mapper;

	public Company createCompany(Company company) {
		
		CompanyEntity entity = getEmployeeEntity(company);
		
		//CompanyEntity entity = mapper.map(company, CompanyEntity.class);
		
		CompanyEntity newEntity = companyRepository.save(entity);
		
		return mapper.map(newEntity, Company.class);
	}


	private CompanyEntity getEmployeeEntity(Company company) {
		CompanyEntity entity = new CompanyEntity();
		BeanUtils.copyProperties(company, entity);
		
		List<EmployeeEntity> employees = new ArrayList<EmployeeEntity>();
		company.getEmployees().forEach(e ->{
			EmployeeEntity employeeEntity = new EmployeeEntity();
			BeanUtils.copyProperties(e, employeeEntity);
			employees.add(employeeEntity);
			
		});
		entity.setEmployees(employees);
		return entity;
	}


	public List<Company> getAllCompanies() {
		return companyRepository.findAll().stream().map(e -> mapper.map(e, Company.class)).collect(Collectors.toList());
	}

	public Company getCampany(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company updateCompany(Company user, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCompany(String id) {
		// TODO Auto-generated method stub
		
	}


}
