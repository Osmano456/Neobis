package com.example.demo2.repository;

import com.example.demo2.models.Cake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CakeRepository extends JpaRepository<Cake, Integer> {
}
