package sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> h = new HashMap();
		
		//put
		
		h.put("ENGLISH", 90);
		h.put("Tamil", 80);
		h.put("Science", 90);
		h.put("Social", 80);
		h.put("ENGLISH", 60);
		h.put(null, 100);
		h.put("Bio", null);
		
		System.out.println(h);
		
		System.out.println(h.get("Tamil"));
		
		//key--> keySet()
		
		Set<String> g = h.keySet();
		
		g.forEach(p->System.out.println(p));
		
		
		Collection<Integer> x = h.values();
		
		x.forEach(r->System.out.println(r));
		
		//entryset
		
		Set<Entry<String, Integer>> s = h.entrySet();
		
		s.forEach(q->System.out.println(q.getKey()+q.getValue()));
		
		
		
		
		
	}

}
