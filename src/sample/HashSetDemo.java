package sample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Object> h = new HashSet();
		
		//add
		
		h.add("ORANIUM");
		h.add(true);
		h.add(null);
		h.add("ORANIUM");
		h.add('c');
		h.add(343.54f);
		h.add(134);
		h.add(false);
		h.add("ORANIUM");
		
		System.out.println(h);
		
		//using enhanced for loop
		
		for(Object v:h)
		{
			
			System.out.println(v);
		}
		
		System.out.println("================");
		//using lamda expression
		
		h.forEach(p->System.out.println(p));
		
		//using iterator
		
		System.out.println("===========");
		
		Iterator<Object> i = h.iterator();
		
		while(i.hasNext())
		{
			
			
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
	}

}
