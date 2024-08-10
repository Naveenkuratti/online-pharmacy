package com.jsp.onlinepharmacy.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor


public class User {
	
	

	private int id;
	private String name;
	private String address;
	
		
	

}
