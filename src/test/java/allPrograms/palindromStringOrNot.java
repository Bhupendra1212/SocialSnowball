package allPrograms;

public class palindromStringOrNot {
	public static void main(String[] args) {
		String s="Pankaj";
		char ch;
		String rev="";
	    String temp=s;
		for(int i=0;i<=s.length()-1;i++) {
			rev=s.charAt(i)+rev;
			
		}
		System.out.println(rev);
		if(temp.equals(rev)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not palindrom");
		}
		
		
	}

}
