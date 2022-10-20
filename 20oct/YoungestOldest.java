//// WAP to print print bill with or without discount
////import packages
import java.util.Scanner;

////Declaring a class
class YoungestOldest

{////Starting of main
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		float age1,age2,age3;   ////Declaring variables
		
		System.out.println("Enter First boy's age: ");    ////inputs by users
		age1 = sc.nextFloat();
		System.out.println("Enter Second boy's age: ");
		age2 = sc.nextFloat();
		System.out.println("Enter Third boy's age: ");
		age3 = sc.nextFloat();
		
		if((age1>age2)&&(age1>age3))  //// if else conditions for the oldest
			System.out.println("First boy is the oldest with age "+ age1);
		else if(age2>age3)
			System.out.println("Second boy is the oldest with age "+ age2);
		else
			System.out.println("Third boy is the oldest with age "+ age3);
		
		if((age1<age2)&&(age1<age3))   //// if else condition for the youngest
			System.out.println("First boy is the youngest with age "+ age1);
		else if(age2<age3)
			System.out.println("Second boy is the youngest with age "+ age2);
		else
			System.out.println("Third boy is the youngest with age "+ age3);
	} ////end of main
} ////end of class