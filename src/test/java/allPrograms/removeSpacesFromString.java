package allPrograms;

public class removeSpacesFromString {

	public static void main(String[] args) {
		String s = "Welcome to I  N DI A";
		String k = (s.substring(10, 20).replaceAll(" ", ""));
		System.out.println(k);
		String[] parts = s.split(" ");
		System.out.println(parts[0] + " " + parts[1] + " " + k);

	}

}
