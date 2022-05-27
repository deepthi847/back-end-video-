package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Trainee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer trainee_id;
    private String trainee_name;
    
    public Trainee() {
    }

	public Trainee(Integer trainee_id, String trainee_name) {
		super();
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
	}

	public Integer getTrainee_id() {
		return trainee_id;
	}

	public void setTrainee_id(Integer trainee_id) {
		this.trainee_id = trainee_id;
	}

	public String getTrainee_name() {
		return trainee_name;
	}

	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}

	@Override
	public String toString() {
		return "Trainee [trainee_id=" + trainee_id + ", trainee_name=" + trainee_name + "]";
	}
    
    
}
    
    
	


