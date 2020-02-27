package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
	public Trainer getByName(String name);
}
