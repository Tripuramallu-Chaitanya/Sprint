package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Broker;
import com.cg.exception.BrokerNotFoundException;
import com.cg.service.IBrokerService;

@RestController
@RequestMapping("/broker")
public class ReportController {
	@Autowired
	IBrokerService bser;
	
	@PostMapping
	public Broker addBroker(@RequestBody Broker bro) {
		return bser.addBroker(bro);
	}
	
	@GetMapping
	public List<Broker> getAll() {
		return bser.listAllBrokers();
	}
	
	@GetMapping("{/broId}")
	public Broker findBroker(@PathVariable int broId) throws BrokerNotFoundException {
		return bser.viewBroker(broId);
	}
	
	@PutMapping
	public Broker updateBroker(@RequestBody Broker bro) throws BrokerNotFoundException {
		return bser.editBroker(bro);
	}
	
	@DeleteMapping("/{broId}")
	public Broker deleteBroker(@PathVariable int broId) throws BrokerNotFoundException {
		return bser.removeBroker(broId);
	}
}
