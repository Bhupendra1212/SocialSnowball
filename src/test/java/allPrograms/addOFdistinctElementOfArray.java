package allPrograms;


import java.util.*;

public class addOFdistinctElementOfArray {

	public static void main(String[] args) {
		int ar[] = { 5, 1, 8, 4, 9, 1, 5 }; // Distinct element means unique element and add should be 27

//		Aprroach 1

		HashSet<Integer> hs = new HashSet<Integer>();
		int sum = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			hs.add(ar[i]);

		}
		for (int value : hs) {
			sum = sum + value;

		}
		System.out.println(sum);

		
	}

}
