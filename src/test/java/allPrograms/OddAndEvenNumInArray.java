package allPrograms;

import java.util.ArrayList;

public class OddAndEvenNumInArray {

	public static void main(String[] args) {
		int x[]={ 1, 2, 3, 4, 5, 6, 32, 31, 43, 22, 10, 15, 12 };
		int even=0;
		int odd=0;
	
		for(int i=0;i<=x.length-1;i++) {
			if(x[i]%2==0) {
				System.out.println("even number:-"+x[i]);
			}else {
				System.out.println("odd number:-"+x[i]);
			}
			
			
		}
		

	}

}
