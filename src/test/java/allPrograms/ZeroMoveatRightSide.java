package allPrograms;

import java.util.Arrays;

public class ZeroMoveatRightSide {

	public static void main(String[] args) {
		int a[] = { 1, 2, 0, 4, 5, 0, 7, 0, 3, 7 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] == 0) {

					if (a[j + 1] > a[j]) {
						int num = a[j + 1];
						a[j + 1] = a[j];
						a[j] = num;

					}
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
