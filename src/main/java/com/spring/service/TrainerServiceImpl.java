package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Trainer;
import com.spring.repository.TrainerRepository;
@Service
public class TrainerServiceImpl implements TrainerService {
	@Autowired
	private TrainerRepository repo;
	
	@Override
	public Trainer insertTrainer(Trainer trainer) {		
		return repo.save(trainer);
	}

}
