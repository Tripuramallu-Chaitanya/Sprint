package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Property {
	@Id
	private int propId;
	private String configuration;	// Flat/Shop/Plot
	private String offerType;	// Sell/Rent
	private double offerCost;
	private double areaSqft;
	private String city;
	private String address;
	private String street;
	private boolean status;	// Available(true)/ Sold(false)
	private Broker broker;
	public Property(int propId, String configuration, String offerType, double offerCost, double areaSqft, String city,
			String address, String street, boolean status, Broker broker) {
		super();
		this.propId = propId;
		this.configuration = configuration;
		this.offerType = offerType;
		this.offerCost = offerCost;
		this.areaSqft = areaSqft;
		this.city = city;
		this.address = address;
		this.street = street;
		this.status = status;
		this.broker = broker;
	}
	public Property() {
		super();
	}
	public int getPropId() {
		return propId;
	}
	public void setPropId(int propId) {
		this.propId = propId;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public double getOfferCost() {
		return offerCost;
	}
	public void setOfferCost(double offerCost) {
		this.offerCost = offerCost;
	}
	public double getAreaSqft() {
		return areaSqft;
	}
	public void setAreaSqft(double areaSqft) {
		this.areaSqft = areaSqft;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Broker getBroker() {
		return broker;
	}
	public void setBroker(Broker broker) {
		this.broker = broker;
	}
	
}
