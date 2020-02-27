package com.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.entity.Trainer;
import com.spring.repository.TrainerRepository;

@Service
public class TrainerDetailsService implements UserDetailsService {
	@Autowired
	private TrainerRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			Trainer trainer=repo.getByName(username);	
		if(trainer==null)
			throw new UsernameNotFoundException("Trainer 404");
		else
			return new TrainerPrincipal(trainer);
	}

}
