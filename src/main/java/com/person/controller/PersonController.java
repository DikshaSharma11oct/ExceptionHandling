package com.person.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.exception.PersonNotFoundException;
import com.person.model.PersonEntity;
import com.person.service.IEPersonService;

@RestController
@RequestMapping("/Person")
public class PersonController {
	
	@Autowired
	private IEPersonService iPersonService;
	
	@GetMapping("/all") 
	public ResponseEntity<List<PersonEntity>> getAllpersons() 
	{
		   List<PersonEntity> list= iPersonService.getAllPerson(); 
//		   if (list.isEmpty()) {
//			   throw new 
//		   }
		   return new ResponseEntity<List<PersonEntity>>(list,HttpStatus.OK);
		
	}
	
	@PostMapping("/save") 
	public ResponseEntity<String> saveAllPersons(@RequestBody @Valid PersonEntity personEntity) 
	{
		   PersonEntity saved= iPersonService.saveEmp(personEntity); 
		   return new ResponseEntity<String>("saved",HttpStatus.OK);
		
	}
	@GetMapping("/get/{id}") 
	public ResponseEntity<PersonEntity> getOnePerson(@PathVariable("id") String id) 
	{
		Optional<PersonEntity> personentity= iPersonService.getOnePerson(id);
		if (personentity.isPresent()) {
			PersonEntity person = personentity.get();
			return ResponseEntity.ok(person);
		} 
		else {
			throw new PersonNotFoundException("Id not found exception:" + id);

		}
           
        
		//return new ResponseEntity<PersonEntity>(personentity,HttpStatus.OK);
		
		
	}
	
	
//	@PutMapping("/update/{id}")
//    public ResponseEntity<String> updateEmployee(@RequestBody PersonEntity personentity,@PathVariable("id") String id)
//    { 
//		
//    		PersonEntity person = iPersonService.getOnePerson(id);
//    		BeanUtils.copyProperties(personentity, person);
//    		iPersonService.updatePerson(person);
//    		return new ResponseEntity<String>("updated emp",HttpStatus.OK);
//    }
	
//	@GetMapping("/delete/{id}") 
//	public ResponseEntity<String> deletePerson(@PathVariable("id") String id)
//	{ 
//		
//		   iPersonService.deletePerson(id); 
//		   return new ResponseEntity<String>("delete emp",HttpStatus.OK);
//		
//     }
}