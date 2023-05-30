package com.person.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person_Entity")
public class PersonEntity {
	@Id
	private String id;
	@NotBlank
	@Size(min=3,max=45,message = "name should be between 3 & 45")
	private String name;
	@Pattern(regexp ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message ="Email id is invalid")
	private String email;
	@Size(min=4,max=10,message = "name should be between 4 & 10")
	private String password;
	@NotBlank
	private String addres;
	

}
