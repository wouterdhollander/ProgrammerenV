package be.cvo.b4.person;

import be.cvo.b4.person.service.dto.PersonDTO;
import be.cvo.b4.person.service.manager.PersonManager;

public class Runner {

	public static void main(String[] args) {
	PersonDTO dto = new PersonDTO();
	dto.setName("Fleur");
	dto.setId("2");
	
	PersonManager mgr = new PersonManager();
	mgr.savePerson(dto);
	}

}
