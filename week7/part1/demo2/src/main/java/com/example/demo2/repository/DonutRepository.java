package com.example.demo2.repository;

import com.example.demo2.models.Donut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonutRepository extends JpaRepository<Donut,Integer> {
}
