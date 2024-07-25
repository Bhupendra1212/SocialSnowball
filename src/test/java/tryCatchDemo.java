import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class tryCatchDemo {

	public static void main(String[] args) {
		
		int[] ar= {1,4,6,8,10,35,32};
		int count=0;
		int result=0;
		
		try {
			for(int i=0;i<=ar.length+1;i++) {
				count=ar[i];
				result=result+count;
				
				
			}
				
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array index out of bond");
				System.out.println(result);
			
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("index out of boundException");
			System.out.println(result);
			
		}
		
		

	}

}
