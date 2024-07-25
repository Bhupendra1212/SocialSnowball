package allPrograms;

import java.util.Arrays;
import java.util.Collections;

public class LargestAndLowestNumberInArray {

	public static void main(String[] args) {
		Integer x[] = { 1, 2, 3, 4, 5, 6, 32, 31, 43, 22, 10, 15, 12 };

		/*
		 * int max=Collections.max(Arrays.asList(x)); System.out.println(max); int
		 * min=Collections.min(Arrays.asList(x)); System.out.println(min);
		 */

		int largest = x[0];
		int smallest = x[0];
		for (int i = 0; i <= x.length - 1; i++) {
			if (largest < x[i]) {
				largest = x[i];

			} else if (smallest > x[i]) {
				smallest = x[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

}
