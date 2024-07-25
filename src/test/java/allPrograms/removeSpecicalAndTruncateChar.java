package allPrograms;

public class removeSpecicalAndTruncateChar {

	public static void main(String[] args) {
		String s = " RTe$t!n9 $has7tra";
		String n = s.replaceAll("[^a-z0-9A-Z]","");
		System.out.println(n);

	}

}
