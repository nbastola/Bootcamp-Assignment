package interviewQuestions;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> CapitalCities = new HashMap<>();
		
		CapitalCities.put("Nepal", "Kathmandu");
		CapitalCities.put("India", "Delhi");
		CapitalCities.put("China", "Beijing");
		
		System.out.println(CapitalCities.get("China"));
		System.out.println(CapitalCities);
		
/*	Another approach
 	Set<String> keys = CapitalCities.keySet();
		for(String i : keys)
		{
			System.out.println(i + " " + CapitalCities.get(i));
		}
		*/
		
		
	}
}


