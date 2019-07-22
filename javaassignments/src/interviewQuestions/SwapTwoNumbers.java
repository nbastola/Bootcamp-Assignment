package interviewQuestions;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int x, y;
		
		System.out.println("Enter two numbers for x and y");
		Scanner in= new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		
		x=x+y;   //x=2+4= 6  x=6
		y=x-y;   //y=6-4= 2  y=2
		x=x-y;   //x=6-2= 4  x=4
		
		System.out.println(x+" and "+y);

	}

}
