package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
		
	}
}
