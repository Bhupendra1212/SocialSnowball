package allPrograms;

public class AddDigit {
	public static void main(String[] args) {
		int num=1236778;
		int digit=0;
		int sum=0;
		for(int i=1;num>0;i++) {
			digit=num%10;
			sum=digit+sum;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
