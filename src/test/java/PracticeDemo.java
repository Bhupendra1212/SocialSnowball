import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.LinkedHashMultiset;

public class PracticeDemo {
	public static void main(String[] args) {
		 String s="neharahangdaleyerlihh";
		 char[] ch=s.toCharArray();
		 HashMap<Character,Integer> hm=new HashMap<>();
		 for(char c:ch) {
			 if(hm.containsKey(c)) {
				 hm.put(c, hm.get(c)+1);
			 }else {
				 hm.put(c, 1);
			 }
			 
		 }
		 for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
			 if(entry.getValue()>1)
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
		
		

	}

}
