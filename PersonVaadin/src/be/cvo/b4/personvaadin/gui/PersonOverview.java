package be.cvo.b4.personvaadin.gui;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import be.cvo.b4.person.service.dto.PersonDTO;
import be.cvo.b4.person.service.manager.PersonManager;

public class PersonOverview extends VerticalLayout {
	
	private PersonManager pm;

	public PersonOverview(PersonManager pm) {
		this.pm = pm;
		init();
	}
	
	private void init(){
		for(PersonDTO dto : pm.getAll()){
			addComponent(new Label(dto.toString()));			
		}
	}
	

}
