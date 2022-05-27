package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Integer> {

}
