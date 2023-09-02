package com.compositekey.sample.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CompanyentityPK implements Serializable{
	
	private static final long serialVersionUID = 6663761700733185242L;
	
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@GeneratedValue
	@Column(name = "name")
	private String name;
}


