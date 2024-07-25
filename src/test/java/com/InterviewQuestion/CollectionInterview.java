package com.InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class CollectionInterview {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		String[] parts = null;
		colors.add("Red&Pink");
		colors.add("Green&Red");
		colors.add("Black&White");
		colors.add("White&Pink");
		colors.add("Pink&Blue");
		colors.add("Blue&Yellow");
		colors.add("Blue&Red");

		ArrayList<String> colorlist = new ArrayList();
		for (String part : colors) {
			String[] splitcolours = part.split("&");
			for (String individualcolor : splitcolours) {
				colorlist.add(individualcolor);

			}
		}
		HashMap<String, Integer> colorcount = new HashMap();
		for (String count : colorlist) {
			colorcount.put(count, colorcount.getOrDefault(count, 0) + 1);
			
			

		}
		for(Map.Entry<String, Integer> entry:colorcount.entrySet()) {
			if(entry.getValue()<=1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
	}

}
