//// JavaLab Test 19th Jan
//// Many to many joins 
//// Ankan Goswami
//// Created an Entity class 

package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //// Entity annootation
@Data
@AllArgsConstructor //// Lombok annotations for getter setters methods
@NoArgsConstructor
@ToString
public class Answers {
	
	@Id //// primary key id
	private int id; //// making variables
	private String answerName;
	private String postedBy;

}
