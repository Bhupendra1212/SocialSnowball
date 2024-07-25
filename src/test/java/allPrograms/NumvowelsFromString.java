package allPrograms;

public class NumvowelsFromString {
	public static void main(String[] args) {
		String s = "Pankajineuropeeee";
		char ch;
		int count = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			ch = s.charAt(i);

			if (ch == 'a') {
				count = count + 1;

			} else if (ch == 'e') {
				count = count + 1;
			} else if (ch == 'i') {
				count = count + 1;
			} else if (ch == 'o') {
				count = count + 1;
			} else if (ch == 'u') {
				count = count + 1;
			}

		}
		System.out.println(count);
	}

}
