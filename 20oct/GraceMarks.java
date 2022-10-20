//// WAP to find grace marks
//// importing packages
import java.util.Scanner;

////Declearing a variable
class GraceMarks

{    //// method to See Grace Marks
	static void graceMarks(float marks,float grace1,float grace2)
	{
		if((marks>=35)&&(marks<38))
			System.out.println("Your grace marks is : " + grace1);
		else if ((marks>=38)&&(marks<40))
			System.out.println("Your grace marks is : " + grace2);
		else
			System.out.println("Your grace marks is : " + marks);
	} //// End of the method
	
	
	public static void main(String args[])   //// Starting of main
	{
		Scanner sc = new Scanner(System.in);
		
		float marks,grace1,grace2;  //// declaring variables
		
		System.out.println("Enter your marks: ");  //// Inputs by users
		marks = sc.nextFloat();
		
		grace1 = (marks+5);   //// Calculating Grace Marks
		grace2 = (marks+2);
		
		graceMarks(marks,grace1,grace2);  //// Calling the method
		
	} //// End Of main
}//// End of class
