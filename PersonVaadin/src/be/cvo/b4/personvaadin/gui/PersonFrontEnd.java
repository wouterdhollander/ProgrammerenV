package be.cvo.b4.personvaadin.gui;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import be.cvo.b4.person.service.manager.PersonManager;

public class PersonFrontEnd extends VerticalLayout {
	
	private PersonManager pm;
	
	public PersonFrontEnd() {
		pm = new PersonManager();
		init();
	}
	
	private void init(){
		setMargin(true);
		addComponent(new PersonInput(pm));
		addComponent(new Label("<HR>", ContentMode.HTML));
		addComponent(new PersonOverview(pm));
	}

}
