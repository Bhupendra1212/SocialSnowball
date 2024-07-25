package allPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class printWithCount {

	public static void main(String[] args) {
		String s = "TEESSSSTTTTIIIIINNG"; // output:-T5E2S4I5N2
		char[] ch = s.toCharArray();
		int count = 0;
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for (int i = 0; i <= ch.length-1; i++) {
			count = 0;

			for (int j = 0; j <= ch.length-1; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}

			}
			map.put(ch[i],count);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue());
		}
		
	}

}
