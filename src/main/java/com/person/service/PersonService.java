package com.person.service;

import java.util.List;
import java.util.Optional;

import com.person.model.PersonEntity;

public interface PersonService {
	
	public PersonEntity saveEmp(PersonEntity personEntity);
	public List<PersonEntity> getAllPerson();
	public Optional<PersonEntity> getOnePerson(String id);
	//public void deletePerson(String id);
	//public void updatePerson(PersonEntity personEntity);
	

}
