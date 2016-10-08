package be.cvo.b4.personvaadin.gui.controller;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

import be.cvo.b4.person.service.dto.PersonDTO;
import be.cvo.b4.person.service.manager.PersonManager;
import be.cvo.b4.personvaadin.gui.PersonInput;

public class SaveListener implements ClickListener {

	private PersonInput input;
	private PersonManager pm;

	public SaveListener(PersonInput personInput, PersonManager pm) {
		this.input = personInput;
		this.pm = pm;
	}

	@Override
	public void buttonClick(ClickEvent event) {
		System.out.println("in clicklistener save:" + input.getInputTf().getValue());
		PersonDTO dto = new PersonDTO();
		dto.setName(input.getInputTf().getValue());
		dto.setId(String.valueOf(dto.hashCode()));
		
//		PersonManager pm = new PersonManager();
		pm.savePerson(dto);
	}

}
