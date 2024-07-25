package allPrograms;

public class firstAndLastCharOfString {

	public static void main(String[] args) {
		String str = "Hello World";
		int size = str.length();

		for (int i = 0; i <= str.length()-1; i++) {
			char ch = str.charAt(i);
			if (i == 0) {
				System.out.println(ch);

			}else if(i==str.length()-1) {
				System.out.println(ch);
			}
		}

	}

}
