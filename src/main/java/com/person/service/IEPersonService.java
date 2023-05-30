package com.person.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.person.exception.EmptyInputException;
import com.person.exception.PersonNotFoundException;
import com.person.model.PersonEntity;
import com.person.repository.PersonRepository;

@Service
public class IEPersonService implements PersonService{
	private static final Logger log = LoggerFactory.getLogger(PersonService.class);
	
	@Autowired
	private PersonRepository personRepo;

	@Override
	public PersonEntity saveEmp(PersonEntity personEntity) {
		String uuid =UUID.randomUUID().toString();
		personEntity.setId(uuid);
//		if(personEntity.getName().isEmpty()||personEntity.getName().length()==0)
//		{
//			throw new EmptyInputException("601","Input fields are empty");
//		}
		return personRepo.save(personEntity);
	}

	@Override
	public List<PersonEntity> getAllPerson() {
		return personRepo.findAll();
	}

	@Override
	public Optional<PersonEntity> getOnePerson(String id) {
		Optional<PersonEntity> person=personRepo.findById(id);
		//PersonEntity person=personRepo.findById(id); can't use like this It throws Optional 
		
		//if we use .get then it will throw no such element found exception
		log.info("person's id:" +person);//will provide id of person
		
		//if(person!=null) {
			return person;
			
		//}
		//throw new PersonNotFoundException("Id not found exception:"+id);
	}

//	@Override
//	public void deletePerson(String id) {
//		PersonEntity personEntity=getOnePerson(id);
//		personRepo.delete(personEntity);
//		
//	}

//	@Override
//	public void updatePerson(PersonEntity personEntity) {
//		personRepo.save(personEntity);
//		
//	}

	

}
