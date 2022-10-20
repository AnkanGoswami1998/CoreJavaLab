//// WAP to find if you are eligible to sit in the exam or not by attendence percentage
//// importing packages

import java.util.Scanner;
///Declearing a variable
class AttendencePer

{         //// method to give condition
	static void printAttendende(float attendence,float per,float total)
	{
		if(per>= 75)
			System.out.println("You are eligle to sit in the exam with attendence percentage of  " +per+ " percent");
		else
			System.out.println("You are not eligle to sit in the exam as your attendence percentage is too low......");
	} //// End of the method

	public static void main(String args[])   //// Starting of main
	{
		Scanner sc = new Scanner(System.in);
		
		float attendence,total,per;  //// declaring variables
		
		System.out.println(" Your attendence is out of 150: "); 
		attendence = sc.nextFloat();                           //// Inputs by users
		
		total = 150;
		per = ((attendence/total)*100);   //// Calculating percentage
		
		printAttendende(attendence,per,total);  //// Calling the method
		
	}  //// End Of main
}//// End of class