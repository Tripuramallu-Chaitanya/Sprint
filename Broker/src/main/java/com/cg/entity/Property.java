package com.cg.entity;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;






@Entity
public class Property {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int propId;
	private String configuration;	// Flat/Shop/Plot
	private String offerType;	// Sell/Rent
	private double offerCost;
	private double areaSqft;
	private String city;
	private String address;
	private String street;
	private boolean status;	// Available(true)/ Sold(false)
	@ManyToOne(targetEntity = Broker.class)
	@JoinColumn(name="Broker",referencedColumnName = "userid")
	
	private Broker broker;
	
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
