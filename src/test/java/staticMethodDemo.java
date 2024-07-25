import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class staticMethodDemo {
	
	 public static void main(String[] args) {
		 
		 
		 Map<String, Integer> hm=new LinkedHashMap<>();
		  Map<String,String> hb=new Hashtable<>();
		   Map<String,String> hs=new HashMap<>();  
		   
		   
		   HashSet arlist=new HashSet();
		   arlist.add(7);
		   arlist.add(8);
		   arlist.add(12);
		   arlist.add(12);
		   arlist.add(8);
		   arlist.add(20);
		   System.out.println(arlist);
		   HashSet arlist2=new HashSet();
		   arlist2.addAll(arlist);
		   System.out.println(arlist2);
		
		  
		 
			 
		   
		   
		 }
		   
	}


