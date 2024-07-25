package allPrograms;

public class countDigitFromString {

	public static void main(String[] args) {
		String s = "bhupe100nd20ra30r"; // output=150
		String p = s.substring(5, 8);
		String q = s.substring(10, 12);
		String r = s.substring(14, 16);
		int num1 = Integer.parseInt(p);
		int num2 = Integer.parseInt(q);
		int num3 = Integer.parseInt(r);
		int num4 = num1 + num2 + num3;

		System.out.println(num4);

	}

}
