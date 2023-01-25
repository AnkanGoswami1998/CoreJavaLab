////25th Jan
////Project on SpringBoot
////Entity or PoJo Class
////Ankan Goswami

package com.example.records.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor  ////Lombok Annotations
@AllArgsConstructor
@ToString
public class Book {
	
	@Id  ////Primary key
	private int id;  //// Fields
	private String title,author;
	private int pages,price;

}
