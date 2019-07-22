package interviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//eg: 0 1 1 2 3 5 8 13....
		
		int a = 0; int b = 1;
		
		
		
		
		for (int i= 1; i<=20; i++)
		{
		
		System.out.print(a+ " ");
		
		int c= a+b;
		a=b;
		b=c;
		}
		
				
				

	}

}
