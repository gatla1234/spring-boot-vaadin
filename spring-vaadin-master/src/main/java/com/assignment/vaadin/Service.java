package com.assignment.vaadin;

import org.springframework.stereotype.Component;

@Component
public class Service {
	
	public String sayHello(String name) {
		return "Hello, "+name;
	}
}