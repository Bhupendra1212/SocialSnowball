package com.InterviewQuestion;

import java.util.HashSet;

public class SameCharacterPrintFromTwoString {

	public static void main(String[] args) {
		String a = "octomber";
		String b = "november";
		HashSet<Character> hs=new HashSet();
		
		char c = 0;
		char d = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			c = a.charAt(i);
			for (int j = 0; j <= b.length() - 1; j++) {
				d = b.charAt(j);
				if(c==d) {
//					System.out.print(d+" "); //print same character
					hs.add(d);
				}
				
			}
			

			
		}
		System.out.println(hs);
		for(Character samechar:hs) {  //if we want print only one time same character
			System.out.print(samechar+" ");
			
		}
	}

}
