package inclassjavacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class InclassMaps 
{
	public static void main(String[]args)
	{
		Map<Integer,String> myHashMap = new HashMap<Integer,String>();
		myHashMap.put(55, "Steve");
		myHashMap.put(65, "Smith");
		myHashMap.put(75, "Steve");
		myHashMap.put(82, "Jane");
		/*
		 * System.out.println(myHashMap.get(55));
		 * System.out.println(myHashMap.remove(82));
		 * System.out.println(myHashMap.keySet());
		 * System.out.println(myHashMap.values());
		 */
		System.out.println(myHashMap);
		
		//LinkedHash Map
		
		Map<Integer,String> myLinkedHashMap = new LinkedHashMap<Integer,String>();
		myLinkedHashMap.put(55, "Steve");
		myLinkedHashMap.put(65, "Smith");
		myLinkedHashMap.put(75, "Steve");
		myLinkedHashMap.put(82, "Jane");
		/*
		 * System.out.println(myHashMap.get(55));
		 * System.out.println(myHashMap.remove(82));
		 * System.out.println(myHashMap.keySet());
		 * System.out.println(myHashMap.values());
		 */
		System.out.println(myLinkedHashMap);
		
		//TreeMap
		
		Map<Integer,String> myTreeMap = new TreeMap<Integer,String>();
		myTreeMap.put(55, "Steve");
		myTreeMap.put(65, "Smith");
		myTreeMap.put(75, "Steve");
		myTreeMap.put(82, "Jane");
		/*
		 * System.out.println(myHashMap.get(55));
		 * System.out.println(myHashMap.remove(82));
		 * System.out.println(myHashMap.keySet());
		 * System.out.println(myHashMap.values());
		 */
		System.out.println(myTreeMap);
		
		
		
	}

}
