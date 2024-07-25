package allPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicateFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 5, 5, 6 };
		Set<Integer> set=new HashSet<Integer>();      //Hashsetnot aalowed duplicate
		for(int i=0;i<a.length-1;i++) {
			set.add(a[i]);
		}
		
	   Integer[] b=set.toArray(new Integer[set.size()]);
	   System.out.println(Arrays.toString(b));
					

				
			
		

	}

}
