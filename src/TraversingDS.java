package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TraversingDS {

	public static void main(String[] args) {
		
	Map<Integer, Integer> m1 = new HashMap<>();
	m1.put(1, 10);
	m1.put(2, 20);
	
	for(Map.Entry<Integer, Integer> entry : m1.entrySet()) {
		if(entry.getKey()==1) {
			
			entry.setValue(11);
		}
		
		System.out.println("Traversing Map: "  + "Key: " + entry.getKey() + "Value: "+ entry.getValue() );
	}
	
	System.out.println(m1);
	
	Iterator<Entry<Integer, Integer>> it = m1.entrySet().iterator();
	
	while(it.hasNext()) {
		
		Map.Entry<Integer, Integer> m2 = (Map.Entry<Integer, Integer>)it.next();
		System.out.println("Traversing Map thru Iterator: "  + "Key: " + m2.getKey() + "Value: "+ m2.getValue() );
	}
	
	Set<Integer> s1 = new HashSet<>();
	
	s1.add(1);
	s1.add(2);
	
	for(int i : s1) {
		System.out.println(i);
	}
	
	 Iterator<Integer> it1 = s1.iterator();
	 
	 while(it1.hasNext()) {
		 
		System.out.println(it1.next());
	 }
	 
	 List<Integer> l1 =  new ArrayList<>();
	 
	 l1.add(3);
	 l1.add(4);
	 
	 for(int i =0; i<l1.size(); i++) {
		 
		 System.out.println(l1.get(i));
	 }
	 
	 for(int i: l1) {
		 
		 System.out.println(i);
		 
	 }
	  ListIterator<Integer> lt1 = l1.listIterator();
	  
	  while(lt1.hasNext()) {
		  System.out.println( lt1.next());
		  
	  }
	  
	 // int[] arr = new int[2];
	 // arr[0]= 5;
	 // arr[1]= 6;
	  
	  int[] arr = {5,6,};
	  
	  for(int i =0; i<arr.length; i++) {
		  
		  System.out.println(arr[i]);
	  }
	  
	  

	}

}
