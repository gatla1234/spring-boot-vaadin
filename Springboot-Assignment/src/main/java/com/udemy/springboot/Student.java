package com.udemy.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	private Address address;
	
	public String getStudentAddress(){
		return this.address.getAddress();
	}

}
