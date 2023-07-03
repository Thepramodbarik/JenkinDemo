package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.ZenkinEntity;

@Repository
public interface ZenkinRepository extends JpaRepository<ZenkinEntity, Integer> {

}
