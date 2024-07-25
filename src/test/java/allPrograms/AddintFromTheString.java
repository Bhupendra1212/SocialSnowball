package allPrograms;

public class AddintFromTheString {

	public static void main(String[] args) {
		int result=0;
	String s="H3110 Te5ting Shastra";
	for(int i=0;i<=s.length()-1;i++) {
		if(Character.isDigit(s.charAt(i))) {
		int num=Integer.parseInt(s.charAt(i)+"");
		
		result=result+num;
	}
	}
	System.out.println(result);
	}

}
