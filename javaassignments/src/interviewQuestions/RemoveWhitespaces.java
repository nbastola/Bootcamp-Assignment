package interviewQuestions;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// uneven spaces between words
		String blogName = "how to   do    in  java   .         com";
		 
		String nameWithProperSpacing = blogName.replaceAll("\\s+", " ");
		 
		System.out.println( nameWithProperSpacing );

	}

}
