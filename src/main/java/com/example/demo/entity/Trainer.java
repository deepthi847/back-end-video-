package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trainer_id;
    private String trainer_name;
    
	


public Trainer() {
}




public Trainer(Integer trainer_id, String trainer_name) {
	super();
	this.trainer_id = trainer_id;
	this.trainer_name = trainer_name;
}




public Integer getTrainer_id() {
	return trainer_id;
}




public void setTrainer_id(Integer trainer_id) {
	this.trainer_id = trainer_id;
}




public String getTrainer_name() {
	return trainer_name;
}




public void setTrainer_name(String trainer_name) {
	this.trainer_name = trainer_name;
}




@Override
public String toString() {
	return "Trainer [trainer_id=" + trainer_id + ", trainer_name=" + trainer_name + "]";
}

}

