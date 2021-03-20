package com.cg.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Broker extends User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int broId;
	private String broName;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Property> properties;
	public Broker(int broId, String broName, List<Property> properties) {
		super();
		this.broId = broId;
		this.broName = broName;
		this.properties = properties;
	}
	public Broker() {
		super();
	}
	public int getBroId() {
		return broId;
	}
	public void setBroId(int broId) {
		this.broId = broId;
	}
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
	
}
