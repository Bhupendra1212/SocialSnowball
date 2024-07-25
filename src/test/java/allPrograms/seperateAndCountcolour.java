package allPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class seperateAndCountcolour {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red&Pink");
		colors.add("Green&Red");
		colors.add("Black&White");
		colors.add("White&Pink");
		colors.add("Pink&Blue");
		colors.add("Blue&Yellow");
		colors.add("Blue&Red");
		ArrayList<String> listOfColour = new ArrayList();
		for (String part : colors) {
			String[] coloursplit = part.split("&");
			for (String colournewlist : coloursplit) {
				listOfColour.add(colournewlist); // print list of colour

			}

		}
		System.out.println(listOfColour); // print list of color in the arraylist
		HashMap<String, Integer> colourcount = new HashMap<>();
		for (String count : listOfColour) {
			colourcount.put(count, colourcount.getOrDefault(count, 0) + 1);

		}
		System.out.println(colourcount); // count the colour and print colour and counting
        for(Map.Entry<String, Integer> entry:colourcount.entrySet()) {
        	if(entry.getValue()<=1) {
        		System.out.println(entry.getKey()+" "+entry.getValue());  //print less times colour available
        	} 
        }
	}

}
