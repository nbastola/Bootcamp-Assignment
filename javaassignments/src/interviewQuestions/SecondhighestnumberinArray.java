package interviewQuestions;

import java.util.Arrays;


public class SecondhighestnumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nisha = {1,5,3,2,10};
		Arrays.sort(nisha);   //helps to sort array named nisha 1,2,3,5,10
		
		System.out.println(nisha[nisha.length-2]);   //2nd highest
		
		System.out.println(nisha[nisha.length-1]);   //1st highest
		
		System.out.println(nisha[nisha.length-5]);   //smallest number
	}

}
