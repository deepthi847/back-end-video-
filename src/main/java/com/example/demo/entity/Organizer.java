package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="organizer")
public class Organizer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="org_id")
    private Integer org_id;
	@Column(name="o_name")
    private String o_name;
	
	@Column(name="o_address")
    private String o_address;
   
   
   
    public Organizer() {
    }

    public Organizer(Integer org_id, String o_name, String o_address) {
        this.org_id = org_id;
        this.o_name = o_name;
        this.o_address = o_address;
        
    }
    

	public Integer getOrg_id() {
		return org_id;
	}

	public void setOrg_id(Integer org_id) {
		this.org_id = org_id;
	}

	public String getO_name() {
		return o_name;
	}

	public void setO_name(String o_name) {
		this.o_name = o_name;
	}

	public String getO_address() {
		return o_address;
	}

	public void setO_address(String o_address) {
		this.o_address = o_address;
	}
	

	

	@Override
	public String toString() {
		return "Organizer [org_id=" + org_id + ", o_name=" + o_name + ", o_address=" + o_address + "]";
	}
    
    


}

