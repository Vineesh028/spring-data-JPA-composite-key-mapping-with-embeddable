package com.compositekey.sample.entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "company")
@ToString
public class CompanyEntity {
	
	@EmbeddedId
	private CompanyentityPK companyentityPK;

//	@Id
//	@Column(name = "id")
//	private int companyId;
//
//	@Id
//	@Column(name = "name")
//	private String name;

	@Column(name = "founder")
	private String founder;
	
	@Column(name = "location")
	private String location;
	
	@OneToMany(mappedBy = "companyEntity",fetch=FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<@Valid EmployeeEntity> employees;

}
