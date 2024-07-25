package allPrograms;

import javax.xml.stream.events.Characters;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		String str = "i love india and maharashta";
		String[] parts = str.split(" ");
		for (int i = 0; i <= parts.length - 1; i++) {
			char upper = Character.toUpperCase(parts[i].charAt(0));
			parts[i] = parts[i].replaceFirst(parts[i].charAt(0) + "", upper + "");
			System.out.print(parts[i] + " ");
		}

	}

}
