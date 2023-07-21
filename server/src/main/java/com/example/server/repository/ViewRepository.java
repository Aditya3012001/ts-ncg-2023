package com.example.server.repository;


import com.example.server.model.view;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViewRepository extends JpaRepository<view,Integer> {
}
