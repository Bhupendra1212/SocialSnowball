
package allPrograms;

import java.util.Arrays;

public class subStringandOccurance {

	public static void main(String[] args) {

		String s = "I love love India";
		String[] parts = s.split(" ");
		int count = 0;
		for (int i = 0; i <= parts.length - 1; i++) {
			System.out.println(parts[i]);
			if (parts[i].equals("love")) {
				count = count + 1;
			}

		}
		System.out.println(count);

	}

}
