package com.cg.entity;

import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Broker extends User {
	private String broName;
	@OneToMany(targetEntity = Property.class, mappedBy = "broker")
	@JsonIgnore
	private List<Property> properties;

	public String getBroName() {
		return broName;
	}
	public void setBroName(String broName) {
		this.broName = broName;
	}
	public List<Property> getProperties() {
		return properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	public Broker(String password, String role, String mobile, String email, String city, String broName, List<Property> properties) {
		super(password, role, mobile, email, city);
		this.broName = broName;
		this.properties = properties;
	}
	public Broker() {
	}
	
	
}
