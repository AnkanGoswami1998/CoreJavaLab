//// WAP to print print bill with or without discount
////import packages
import java.util.Scanner;

class Discount ////Starting of class

{
	
	public static void main(String args[])  //// Starting of main
	
	{
		
		Scanner sc = new Scanner(System.in); 
		
		//// Declaring variables
		float bill,discount;  
		int qty;
		
		//// Input given by users
		System.out.println("Enter your Quantity: ");
		qty = sc.nextInt();
		
		//// Calculation
		bill = 540*qty;
		discount = ((bill)-(bill/10));
		
		////If else functions
		if(bill>2000)
			System.out.println("Your bill cost is : " + discount);
		else
			System.out.println("Your bill cost is : " + bill);
	
	}////End of main
}//// End of class