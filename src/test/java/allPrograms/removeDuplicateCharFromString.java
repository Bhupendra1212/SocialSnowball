package allPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class removeDuplicateCharFromString {

	public static void main(String[] args) {
		// Approach 1

		String str = "characters";
		/*
		 * Set<Character> hs = new LinkedHashSet<Character>();
		 * 
		 * for (int i = 0; i <= str.length() - 1; i++) { hs.add(str.charAt(i));
		 * 
		 * } for (Character x : hs) { System.out.print(x); }
		 */
		// Approach 2

		/*
		 * StringBuilder sb = new StringBuilder(); for (int i = 0; i < str.length() - 1;
		 * i++) { char ch = str.charAt(i); int idx = str.indexOf(ch, i + 1); if (idx ==
		 * -1) { sb.append(ch); }
		 * 
		 * } System.out.println(sb);
		 * 
		 */

		// Approach 3
		char[] ch = str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			boolean repeated=false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					repeated=true;
				}
				
			}
			if(!repeated) {
				sb.append(ch[i]);
			}
		}
		
		System.out.println(sb);
	}
}