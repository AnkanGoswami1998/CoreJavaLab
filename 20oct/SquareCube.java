//// WAP to cub,square & checking even & odd
////import packages
import java.util.Scanner;
/// declaring a class
class SquareCube

{
	
	static void square(float num) /// Square Calculation
	{
		float result;
		
		result = num*num;
		
		System.out.println("Square of the number is : " +result);
	}
	
	static void cube(float num)  /// Cube Calculation
	{
		float result;
		
		result = (num*num)*num;
		
		System.out.println("Cube of the number is : " +result);
	}
	
	static void EvenOdd(float num)  /// Even Odd Calculation
	{
		float result;
		
		result = num%2;
		
		if(result==0)    /// if else function
			System.out.println("The number " +num+ " is an even number");
		else
			System.out.println("The number " +num+ " is an odd number");
	}
		
		
	public static void main(String args[])   /// Main Started
	{
		Scanner sc = new Scanner(System.in);
		
		/// Declaring variables
		float num;    
		int choice;
		
		System.out.println("Enter the number: ");   /// inputs by users
		num = sc.nextFloat();
		
		System.out.println(" Type 1 for square ");
		System.out.println(" Type 2 for cube ");
		System.out.println(" Type 3 to check odd or even ");
		System.out.println(" Type 4 to exit ");
		System.out.println(" Enter your choice ");
		
		choice = sc.nextInt();
		
		switch(choice)    //// Switch case started
		{
			case 1 : square(num);
			break;
			case 2 : cube(num);
			break;
			case 3 : EvenOdd(num);
			break;
			case 4 : System.exit(0);
			break;
			default : System.out.println("Wrong Input");
			
		}  ///  End of switch case
	}  /// end of main
}  /// end of class
		
		