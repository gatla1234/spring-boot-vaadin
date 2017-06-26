package com.udemy.springboot;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SpringUI(path="/ui")
@Title(value = "This is the title")
@Theme(value ="valo")
public class MainView extends UI {

	@Override
	protected void init(VaadinRequest request) {
		
final VerticalLayout layout = new VerticalLayout();

layout.addComponent(new Label("Spring boot with vaadin"));
		
Button button = new Button("CLick me");
layout.addComponent(button);
button.addClickListener(new ClickListener() {
	
	@Override
	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub
		layout.addComponent(new Label("Button has been clicked"));
	}
});
setContent(layout);

	}

	
	
}
