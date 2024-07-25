package allPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class secondMaxElementInArray {

	public static void main(String[] args) {
		int x[] = { 1, 12, 45, 23, 12, 32, 21, 12 };
		
//		Aprroach 1
		/*
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int n=x.length;
		
		System.out.println(x[n-2]);
		*/
		
//		Approach 2
		for(int i=0;i<x.length-1;i++) {
			for(int j=0;j<x.length-1;j++) {
				if(x[j]>x[j+1]) {
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
			
		}
		int size=x.length;
		System.out.println(x[size-2]);
		
		}
		
		
		
	}


