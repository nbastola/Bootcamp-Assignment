package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String blogName = "howtodoinjava dot com";
        char[] chars = blogName.toCharArray();
         
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars)
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
         
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
        for(char c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println(c);
	}

}
	}
}