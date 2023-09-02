package com.compositekey.sample.model;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Employee {
	
	@Id
	private int employeeId;

	@NotBlank
	private String name;
	
	@NotBlank
	private String role;

	@NotBlank
	private String department;
	
	@NotBlank
	private String email;

}
