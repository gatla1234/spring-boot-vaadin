package com.assignment.vaadin;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class VaadinUI extends UI {
	
	@Autowired
	private Service service;
	@Override
	protected void init(VaadinRequest request) {
		TextField name = new TextField("Enter your name:");
		Button button = new Button("Send");
		
		VerticalLayout layout = new VerticalLayout(name, button);
		layout.setMargin(true);
		layout.setSpacing(true);
		setContent(layout);
		
		button.addClickListener(e -> Notification.show(service.sayHello(name.getValue())));
		
		
	}

}                        