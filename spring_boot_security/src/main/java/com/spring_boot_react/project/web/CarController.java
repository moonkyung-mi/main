package com.spring_boot_react.project.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_react.project.domain.AppUserRepository;
import com.spring_boot_react.project.domain.Car;
import com.spring_boot_react.project.domain.AppUser;
import com.spring_boot_react.project.domain.CarRepository;

@RestController
public class CarController {
	private final CarRepository repository;
	private final AppUserRepository urepository;

	public CarController(CarRepository repository,AppUserRepository urepository) {
		this.repository = repository;
		this.urepository = urepository;
	}
	
//	@GetMapping("/")
//	public String index() {
//		return "Home";
//	}

	@GetMapping("/cars")
	public Iterable<Car> getCars() {
		return repository.findAll();
	}
	
	@GetMapping("/user")
	public Iterable<AppUser> getUser() {
		return urepository.findAll();
	}	
}
