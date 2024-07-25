package allPrograms;

public class reverseString {

	public static void main(String[] args) {
		/*
		String s="Shastra";
		char ch;
		String rev="";
		for(int i=0;i<=s.length()-1;i++) {
			ch=s.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println(rev);
      */
		
		
		String s="Shastra";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		
	}

}
