package allPrograms;

public class countEachletterTwice {

	public static void main(String[] args) {
		String str = "hello";
		char ch;
		for (int i = 0; i <= str.length() - 1; i++) {
			ch = str.charAt(i);
			System.out.print(ch + "" + ch);

		}

	}

}
