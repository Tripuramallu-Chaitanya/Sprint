package com.cg.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Property;

import com.cg.service.IPropertyService;

@RestController
@RequestMapping("/property")
public class ProController {
	@Autowired
	IPropertyService ser;
	@PostMapping
	public Property createProperty(@RequestBody Property p) {
		ser.createProperty(p);
		return p;
	}
	@GetMapping("/{propId}")
	public Property getProperty(@PathVariable int propId) {
		return ser.getProperty(propId);
	}
}
