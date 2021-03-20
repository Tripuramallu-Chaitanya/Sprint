package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Broker;
import com.cg.exception.BrokerNotFoundException;
import com.cg.repository.IBrokerRepo;
@Service
public class IBrokerServiceImpl implements IBrokerService{
	@Autowired
	IBrokerRepo bDao;

	@Override
	public Broker addBroker(Broker bro) {
		return bDao.saveAndFlush(bro);
	}

	@Override
	public Broker editBroker(Broker bro) throws BrokerNotFoundException {
		return bDao.saveAndFlush(bro);
	}

	@Override
	public Broker removeBroker(int broId) throws BrokerNotFoundException {
		Optional<Broker> b = bDao.findById(broId);
		if (b.isPresent()) {
			bDao.deleteById(broId);
			return b.get();
		}
		else
			throw new BrokerNotFoundException("Broker with given BrokerId is not available!");
		
	}

	@Override
	public Broker viewBroker(int broId) throws BrokerNotFoundException {
		Optional <Broker> op = bDao.findById(broId);
		if (op.isPresent())
			return op.get();
		else
			throw new BrokerNotFoundException("Broker with given BrokerId is not available!");
	}

	@Override
	public List<Broker> listAllBrokers() {
		return bDao.findAll();
	}

}
