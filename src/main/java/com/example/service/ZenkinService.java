package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ZenkinEntity;
import com.example.repository.ZenkinRepository;

@Service
public class ZenkinService {
	static {
		System.out.println("inside service class....");
	}
	@Autowired
	private ZenkinRepository repo;

	public ZenkinEntity save(ZenkinEntity entity) {

		return repo.save(entity);
	}

	public ZenkinEntity getDetails(int id) {

		return repo.findById(id).orElseThrow();
	}

}
