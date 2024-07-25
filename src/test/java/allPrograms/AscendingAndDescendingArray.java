package allPrograms;

import java.util.Arrays;
import java.util.Collections;

public class AscendingAndDescendingArray {

	public static void main(String[] args) {
		Integer x[] = { 1, 2, 3, 4, 5, 6, 32, 31, 43, 22, 10, 15, 12 };
//		System.out.println("Before the sorting:"+ Arrays.toString(x));
//		  Arrays.sort(x);
//		  System.out.println(Arrays.toString(x));
//
//		Arrays.toString(x);
//		Arrays.parallelSort(x);
//		System.out.println(Arrays.toString(x));

		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1; j++) {
				if(x[j]>x[j+1]) {
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(x));  //ascending order

		// Descending order
//		Arrays.sort(x, Collections.reverseOrder());
//		System.out.println(Arrays.toString(x));
		
		for(int i=0;i<x.length-1;i++) {
			for(int j=0;j<x.length-1;j++) {
				if(x[j+1]>x[j]) {
					int num=x[j+1];
					x[j+1]=x[j];
					x[j]=num;
				}
			}
		}
		System.out.println(Arrays.toString(x)); //descending orders

	}

}
