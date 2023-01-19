//// JavaLab Test 19th Jan
//// Many to many joins 
//// Ankan Goswami
//// Created another Entity class 
package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString //// lombok annotations
@AllArgsConstructor
@NoArgsConstructor
public class Questions {
	
	@Id //// primary key id
	private int id; //// Coloumns
	private String qname;
	
	@ManyToMany(targetEntity=Answers.class,cascade= {CascadeType.ALL}) //// Many to many joins
	private Set<Answers> answers;

}
