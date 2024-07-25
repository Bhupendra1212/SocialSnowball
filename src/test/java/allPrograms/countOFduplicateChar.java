package allPrograms;

import java.util.HashMap;
import java.util.Map;

public class countOFduplicateChar {

	public static void main(String[] args) {
		
//		Approach1
		/*
		String str = "bhupendra bhagat";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char m : ch) {
			if (map.containsKey(m)) {
				map.put(m, map.get(m) + 1);

			}else {
				map.put(m, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"   "+entry.getValue());
			}
		}

      */
		
//		Approach2
		
		
		  String s = "bhupendra bhagat";
		String p = s.replaceAll(" ", "");
		char ch = 0;
		char ch1 = 0;
		int count = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i <= p.length() - 1; i++) {
			ch = p.charAt(i);
			count = 0;

			for (int j = 0; j <= p.length() - 1; j++) {
				ch1 = p.charAt(j);
				if (ch == ch1) {
					count++;
					hm.put(ch, count);

				} 

			}
		}
			for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
			}
			
			
		 
	}

}
