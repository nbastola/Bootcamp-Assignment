package interviewQuestions;

import java.util.Scanner;

public class Userinputprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		 int number = userInput.nextInt();
		 
		 boolean isPrime = true;
			
			
			for (int i=2; i<number; i++)
			{
				if(number% i==0)
				{
				
				isPrime = false;
				break;
				}
			}
			
			if (isPrime) {
				System.out.println("Number is Prime::"+ number);
			}
			else {
				System.out.println("Number is Not Prime::");
	}

}
}
