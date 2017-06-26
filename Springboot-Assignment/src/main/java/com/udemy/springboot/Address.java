package com.udemy.springboot;

import org.springframework.stereotype.Component;

@Component
public class Address {


	private String address = "204 w 36";
	
	public String getAddress(){
		return this.address;
	}
	
}
