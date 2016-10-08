package be.cvo.b4.personvaadin.gui;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

import be.cvo.b4.person.service.manager.PersonManager;
import be.cvo.b4.personvaadin.gui.controller.SaveListener;

public class PersonInput extends HorizontalLayout {
	
	private TextField inputTf;
	private PersonManager pm;

	public PersonInput(PersonManager pm) {
		this.pm = pm;
		init();
	}
	
	private void init(){
		addComponent(createLbl());
		addComponent(createInput());
		addComponent(createButton());
	}

	private Component createLbl() {
		return new Label("Geef naam:");
	}

	private Component createInput() {
		inputTf = new TextField();
		return inputTf;
	}
	
	public TextField getInputTf() {
		return inputTf;
	}

	private Component createButton() {
		Button b = new Button("Save");
		b.addClickListener(new SaveListener(this, pm));
		return b;
	}

}
