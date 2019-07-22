package interviewQuestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter a string: ");
		 System.out.println("==================");
		Scanner userInput = new Scanner(System.in);
		 String original = userInput.nextLine();
		
		String reverse = ""; 
		int len = original.length();
		 for (int i = len-1; i>=0; i--)
		 {
			 reverse = reverse + original.charAt(i);
			 
		 }
		 
		 if(original.equals(reverse))
		 {
		 System.out.println(" The Userinput is palindrome::" + original);
		 }
		 else {
			 
		 
			System.out.println("USerinput is not palindrome::"+original);
		 }
		 
	}

}


