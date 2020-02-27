package com.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.configuration.TrainerPrincipal;
import com.spring.entity.Trainer;
import com.spring.service.TrainerServiceImpl;

@RestController
public class TrainerController {
	@Autowired
	private TrainerServiceImpl service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/logout-success")
	public ModelAndView logoutPage () {
		return new ModelAndView("logout");
	}
	
	@PostMapping("training/add")
	//@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Trainer> addTrainer(@Valid @RequestBody Trainer trainer){		
		if(trainer==null)
			
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok().body(service.insertTrainer(trainer));
	}
	
//	@RequestMapping("/user")
//	@ResponseBody
//	public TrainerPrincipal user(TrainerPrincipal principal) {
//		return principal;
//	}
}
