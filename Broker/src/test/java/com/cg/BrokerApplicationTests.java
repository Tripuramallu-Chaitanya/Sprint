package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cg.entity.Broker;
import com.cg.entity.Property;
import com.cg.exception.BrokerNotFoundException;
import com.cg.service.IBrokerService;

@SpringBootTest
class BrokerApplicationTests extends AbstractTest{
	@Autowired
	IBrokerService iSer;
	
	@Override
	@BeforeEach
	public void setUp() {
		super.setUp();
	}
	
//	@Test
//	public void getBroker() throws Exception{
//		String uri = "/broker/get/1";
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)).andReturn();
//		int status = mvcResult.getResponse().getStatus();
//		assertEquals(200,status);
//		String content = mvcResult.getResponse().getContentAsString();
//		Broker bro = super.mapFromJson(content, Broker.class);
//		assertEquals("Name1",bro.getBroName());
//	}
	
	
//	@Test
//	public void getAllBroker() throws Exception{
//		String uri = "/broker/all";
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)).andReturn();
//		int status = mvcResult.getResponse().getStatus();
//		assertEquals(200,status);
//		String content = mvcResult.getResponse().getContentAsString();
//		Broker brokerList[] = super.mapFromJson(content, Broker[].class);
//		assertEquals("Name1",brokerList[0].getBroName());
//	}
	
	
//	@Test
//	public void createBroker() throws Exception{
//		String uri = "/broker/add";
//		List<Property> p = new ArrayList<Property>();
//		Broker bro = new Broker("password2", "Broker", "mobile3", "email3", "city3", "name3",p);
//		String inputJson = super.mapToJson(bro);
//		System.out.println("==========================="+inputJson+"======================================");
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
//		int status = mvcResult.getResponse().getStatus();
//		assertEquals(200, status);
//		String content = mvcResult.getResponse().getContentAsString();
//		Broker broker = super.mapFromJson(content, Broker.class);
//		assertEquals("Broker", broker.getRole());
//	}
	
	
	
	//***********************Not working properly************************************
	
//	@Test
//	public void updateBroker(Broker bro) throws Exception{
//		List<Property> li = new ArrayList<Property>(); 
//		bro = new Broker("pass3","Broker", "0123456789", "email33", "hyd", "Howle",li);
//		String uri = "/broker/update";
//		String uri2 = "/broker/get/2";
//		MvcResult mvcResult2 = mvc.perform(MockMvcRequestBuilders.get(uri2)).andReturn();
//		String content2 = mvcResult2.getResponse().getContentAsString();
//		Broker brok = super.mapFromJson(content2, Broker.class);
//		brok.setBroName(bro.getBroName()); 
//		brok.setCity(bro.getCity());
//		brok.setEmail(bro.getEmail());
//		brok.setMobile(bro.getMobile());
//		brok.setPassword(bro.getPassword());
//		brok.setProperties(bro.getProperties());
//		brok.setRole(bro.getRole());
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)).andReturn();
//		String content = mvcResult.getResponse().getContentAsString();
//		Broker brok1 = super.mapFromJson(content, Broker.class);
//		assertEquals("hyd", brok1.getCity());
//	}
	
	//*************working*********************
	
//	@Test
//	public void updateBroker() throws BrokerNotFoundException {
//		List<Property> li = new ArrayList<Property>();
//		Broker bro = new Broker("pass3","Broker", "0123456789", "email33", "hyd", "Howle",li);
//		iSer.addBroker(bro);
//		bro.setBroName("Bakra");
//		iSer.editBroker(bro);
//		assertEquals("Bakra", iSer.viewBroker(5).getBroName());
//	}
	
	@Test
	public void deleteBroker() throws Exception{
		String uri = "/broker/remove/5";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200,status);
		String content = mvcResult.getResponse().getContentAsString();
		Broker bro = super.mapFromJson(content, Broker.class);
		assertEquals("hyd",bro.getCity());
	}
}
