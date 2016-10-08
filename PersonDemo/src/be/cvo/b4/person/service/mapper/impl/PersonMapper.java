package be.cvo.b4.person.service.mapper.impl;

import be.cvo.b4.person.business.Person;
import be.cvo.b4.person.service.dto.PersonDTO;
import be.cvo.b4.person.service.mapper.AbstractMapper;

public class PersonMapper extends AbstractMapper<PersonDTO, Person>{

	@Override
	public PersonDTO mapToDTO(Person b) {
		if( b == null)
			return null;
		PersonDTO dto = new PersonDTO();
		dto.setName(b.getName());
		dto.setId(String.valueOf(b.getId()));
		return dto;
	}

	@Override
	public Person mapToBus(PersonDTO d) {
		if(d== null)
			return null;
		Person p = new Person();
		p.setName(d.getName());
		p.setId(Long.valueOf(d.getId()));
		return p;
	}

}
