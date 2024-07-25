package allPrograms;

public class missingNumInArray {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 3, 2, 8, 6 };
		int sum2=0;
		int misselement=0;
		int sum=1+2+3+4+5+6+7+8;
		
		for(int i=0;i<=a.length-1;i++) {
			sum2=a[i]+sum2;
		}
		misselement=sum-sum2;
		System.out.println(misselement);

	}

}
