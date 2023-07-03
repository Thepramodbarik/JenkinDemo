package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ZenkinEntity;
import com.example.service.ZenkinService;

@RestController
public class ZenkinController {

	@Autowired
	private ZenkinService service;

	@PostMapping("/save")
	public ZenkinEntity save(@RequestBody ZenkinEntity entity) {
		return service.save(entity);
	}

	@GetMapping("/get/{id}")
	public ZenkinEntity getDetails(@PathVariable int id) {
		return service.getDetails(id);
	}

	@GetMapping("/print")
	public String Print() {
		return "Welcome to Jenkin Application";
	}

}
