package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Property;
@Repository
public interface IPropertyRepository extends JpaRepository<Property, Integer>{

}
