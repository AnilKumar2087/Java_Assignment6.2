package assignemnt6_2;

import java.util.Scanner;

public class AgeExcDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur age :: ");
		int age = s.nextInt();
			  
		try {
			
			if(age < 0) 
				throw new Exception_Age("You have entered negative age");
			else
				System.out.println("Valid age");
			
		 }
		catch (Exception_Age a) {
			
			System.out.println(a);
			
		}
		s.close();
	}
}

