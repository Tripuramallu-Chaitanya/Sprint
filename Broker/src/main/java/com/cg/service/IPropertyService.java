package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Property;
import com.cg.repository.IPropertyRepository;

@Service
public class IPropertyService {
	@Autowired
	IPropertyRepository dao;
	
	public List<Property> createProperty(Property p) {
		dao.saveAndFlush(p);
		return dao.findAll();
	}
	
	public Property getProperty(int propId) {
		return dao.findById(propId).get();
	}
}
