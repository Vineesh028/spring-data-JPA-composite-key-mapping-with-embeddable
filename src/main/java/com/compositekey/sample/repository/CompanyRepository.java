package com.compositekey.sample.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compositekey.sample.entity.CompanyEntity;


@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, String> {

}
