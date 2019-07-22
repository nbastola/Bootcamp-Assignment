package inclassjavacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InclassSETS {
	public static void main(String[]args)
	{
		Set<String> mySet = new HashSet<String>();
		mySet.add("BMW");
		mySet.add("Audi");
		mySet.add("Audi");
		mySet.add("Honda");
		mySet.add("Honda");
		System.out.println("HashSet is " + mySet);
		
		Set<String> mySet1 = new LinkedHashSet<String>();
		mySet1.add("BMW");
		mySet1.add("Audi");
		mySet1.add("Audi");
		mySet1.add("Honda");
		mySet1.add("Honda");
		System.out.println("LinkedHashSet is" +mySet1);
		
		Set<String> mySet2 = new TreeSet<String>();
		mySet2.add("BMW");
		mySet2.add("Audi");
		mySet2.add("Audi");
		mySet2.add("Honda");
		mySet2.add("Honda");
		//remove dosen't work with indexes do writ 
		mySet2.remove("Honda");
		
		System.out.println("TreeSet is" +mySet2);
		
		
		
		
	}

}
