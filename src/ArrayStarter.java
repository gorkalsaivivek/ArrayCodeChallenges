package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayStarter {
	
	public static void main(String[] args) {
		System.out.println((String)null);
		HashMap<Integer, Integer> happy=new HashMap<>();
		happy.put(1, 10);
		happy.put(2, 20);
		
		happy.forEach((x,y) -> System.out.println(x +" value" + y));
		
		//Map.Entry<Integer, Integer> m= happy.entrySet();
		
		for(Map.Entry<Integer, Integer> m: happy.entrySet()) {
			m.getKey();
			m.getValue();
			
		}
		Iterator<Entry<Integer, Integer>> it=happy.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<Integer, Integer> map=(Map.Entry<Integer, Integer>)it.next();
			map.getKey();
			map.getValue();
		}
		
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		
		Iterator<Integer> itvalue=hashSet.iterator();
		while(itvalue.hasNext()) {
			itvalue.next();
		}
		
		
		for(int i:hashSet) {
			System.out.println(i);
		}
		
		hashSet.forEach(x-> System.out.println(x));
		
		Map<Integer, Integer> m1 = new HashMap();
		
		m1.put(1, 2);
		m1.put(3, 4);
		
		for(Map.Entry<Integer, Integer> entry: m1.entrySet()) {
			
			entry.getKey();
		}
		
		Iterator<Entry<Integer, Integer>> it2 = m1.entrySet().iterator();
		while(it2.hasNext()) {
			
			Map.Entry<Integer, Integer> m3 = (Map.Entry<Integer, Integer>)it2.next();
		}
		
		Set<Integer> set2 = new HashSet();
		
		for(int i: set2) {
			System.out.println(i);
		}
		
		Iterator<Integer> it4 = set2.iterator();
		
		while(it4.hasNext()){
			 it4.next();
		}
		
		
		
	}
}
