package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello World";
		//1) Using for loop; we don't have any reverse function in String; String is imutable
		String rev = "";
		
		int len = s.length();
		for (int i= len-1; i>=0; i--)
		{
		
			rev= rev + s.charAt(i);
			
		}
		System.out.println(rev);
		
		//2) Using StringBuffer class; StringBuffer is mutable and we have Reverse function 
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		}

	}

