package allPrograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class countDuplicateInArray {

	public static void main(String[] args) {
		int ar[] = { 10, 20, 34, 12, 10, 23, 10, 12 };
		int count = 0;
		Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
		for (int i = 0; i <= ar.length - 1; i++) {
			count = 0;
			for (int j = 0; j <= ar.length - 1; j++) {

				if (ar[i] == ar[j]) {
					count++;
				}

			}
			map.put(ar[i], count);
			

		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}

	}

}
