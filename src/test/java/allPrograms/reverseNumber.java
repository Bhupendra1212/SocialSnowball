package allPrograms;

public class reverseNumber {

	public static void main(String[] args) {
		int num = 234567;
		/*
		 * for (int i = 0; num > 0; i++) { rev = num % 10; System.out.print(rev); num =
		 * num / 10;
		 * 
		 * }
		 */
//		Approach2
		/*
		 * int rev=0; for(int i=1;num>0;i++) { rev=(rev*10)+num%10; num=num/10; }
		 * System.out.println(rev);
		 * 
		 */

//		Approach3
   /*
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
*/
	
	
//	Approach 4
	
	StringBuilder s=new StringBuilder();
	s.append(num);
	StringBuilder rev=s.reverse();
	System.out.println(rev);
	
	}
}
