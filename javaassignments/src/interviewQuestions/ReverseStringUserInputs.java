package interviewQuestions;

import java.util.Scanner;

public class ReverseStringUserInputs {

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
		 
		 System.out.println("reverse string is: " + reverse);
	}

}
