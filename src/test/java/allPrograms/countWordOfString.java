package allPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class countWordOfString {

	public static void main(String[] args) {
		String s="I love india where maharashtra is available";
		String[] parts=s.split(" ");
		int count=0;
		System.out.println(Arrays.asList(parts));
//		OR
		System.out.println(parts.length);
		for(int i=0;i<=parts.length-1;i++) {
			count++;
		}
		System.out.println(count);
		
				

	}

}
