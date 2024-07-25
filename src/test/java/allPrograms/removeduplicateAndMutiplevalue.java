package allPrograms;

import java.util.HashSet;

public class removeduplicateAndMutiplevalue {

	public static void main(String[] args) {
		int[] x={1,2,2,3,4,5,1};
		int count=1;
		HashSet<Integer> hs=new HashSet();
		for(int i=0;i<x.length-1;i++) {
			hs.add(x[i]);
			
		}for(Integer value:hs) {
			count=value*count;
			
			
		}
		System.out.println(count);

	}

}
