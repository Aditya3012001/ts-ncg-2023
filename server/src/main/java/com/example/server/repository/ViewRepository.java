package com.example.server.repository;

import com.example.server.model.view;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ViewRepository extends CrudRepository<view,Integer> {
}
