package sample;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> t = new TreeMap();
		
		t.put("ENGLISH", 90);
		t.put("Tamil", 80);
		t.put("Science", 90);
		t.put("Social", 80);
		t.put("ENGLISH", 60);
		//t.put(null, 100);
		t.put("Bio", null);
		
		System.out.println(t);
		
		//
		
		Set<String> h = t.keySet();
		
		h.forEach(q->System.out.println(q));
		
		
		Collection<Integer> v = t.values();
		
		v.forEach(s->System.out.println(s));
		
		
		Set<Entry<String, Integer>> y = t.entrySet();
		
		y.forEach(k->System.out.println(k.getKey()+k.getValue()));
		
		
	}

}
