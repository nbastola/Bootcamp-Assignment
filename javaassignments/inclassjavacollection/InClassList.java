package inclassjavacollection;

import java.util.ArrayList;

public class InClassList {
	
	public static void main(String[]args)
	{
		long timest =System.currentTimeMillis();
		System.out.println(timest);
		
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("array list length is "+arr.size());
		
		  
		arr.add("tom");
		arr.add("1234");
		arr.add("laura");
		System.out.println("arraylist is " +arr);
		arr.remove(0);
		//System.out.println(arr);
		System.out.println("array list length is "+arr.size());
		long timeend =System.currentTimeMillis();
		System.out.println(timeend);
		System.out.println("using FORLOOP os ");
		/*
		 * for(int i =0; i<=arr.size();i++) { System.out.println(arr); }
		 */
		 
		for(String item:arr)
		{
			System.out.println(item);
		}
		System.out.println("difffe is " + (timeend - timest));
		
	}
	
	}


