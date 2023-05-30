package com.person.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.person.model.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, String> {
	
	Optional<PersonEntity> findById(String id);
	//PersonEntity findById(String id);

}
