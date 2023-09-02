package com.compositekey.sample.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Company {
	
	@NotBlank
	private int id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String founder;

	@NotBlank
	private String location;
	
	@NotNull(message="Employees are missing !")
	@NotEmpty(message="Employees are empty !")
    private List<@Valid Employee> employees;

}
