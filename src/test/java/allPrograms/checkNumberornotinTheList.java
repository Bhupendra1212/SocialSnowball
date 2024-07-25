package allPrograms;

import java.util.LinkedList;
import java.util.List;

public class checkNumberornotinTheList {
	
	public static void main(String[] args) {
		 List<Integer> list=new LinkedList();
		 int num=16;
		 list.add(10);
		 list.add(11);
		 list.add(12);
		 list.add(16);
		 list.add(13);
		 System.out.println(list);
		 for(int i=1;i<=list.size();i++) {
			 int digit=list.get(i);
			 if(digit==num) {
				 System.out.println(digit);
				 
			 }
			 
		 }

	}

}
