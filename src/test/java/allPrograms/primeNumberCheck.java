package allPrograms;

import java.util.Scanner;

public class primeNumberCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		
		int count = 0;

		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				count++;

			}

		}if(count==0) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		

	}
}