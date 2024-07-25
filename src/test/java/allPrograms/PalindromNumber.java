package allPrograms;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=12123;
		int rev=0;
		int temp=num;
		for(int i=1;num>0;i++) {
			rev=(rev*10)+num%10;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Palindrom");
		}else {
			System.out.println("not palindrom");
		}
		

	}

}
