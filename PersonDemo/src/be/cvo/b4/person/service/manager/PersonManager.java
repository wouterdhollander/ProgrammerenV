package be.cvo.b4.person.service.manager;

import be.cvo.b4.person.business.Person;
import be.cvo.b4.person.business.repository.impl.PersonRepository;
import be.cvo.b4.person.service.dto.PersonDTO;
import be.cvo.b4.person.service.mapper.impl.PersonMapper;

public class PersonManager {
	
	private PersonMapper mapper;
	private PersonRepository repo;

	public PersonManager() {
		mapper = new PersonMapper();
		repo = new PersonRepository();
	}
	
	public void savePerson(PersonDTO dto){
		Person p = mapper.mapToBus(dto);
		repo.save(p);
	}

}
