package com.compositekey.sample.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EmployeeEntityentityPK implements Serializable{
	
	private static final long serialVersionUID = -3142904869329240017L;
	
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "name")
	private String name;
}


