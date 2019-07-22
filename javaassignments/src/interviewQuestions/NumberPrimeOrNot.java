package interviewQuestions;

public class NumberPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eg: 2,3,5,7-divisible by 1 or itself
		
		int number = 7;
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
	

		

		

