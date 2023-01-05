//// Javalab exam 5th Dec
//// Ankan Goswami
//// StudentCrud Operation by Hibernate
//// Creating an entity class with Lombok

package StudentCrud;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor   ////Lombok Annotations
@NoArgsConstructor
public class StudentManagement {  //// Table name StudentManagement
	
	@Id
	private int Student_ID;
	private String Student_name,Email,Subject;

}
