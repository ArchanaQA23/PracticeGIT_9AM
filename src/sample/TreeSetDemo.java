package sample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	
	public static void main(String[] args) {
		
		
		TreeSet<String> t = new TreeSet();
		
		t.add("ORANIUM");
		t.add("ENGLISH");
		//t.add(null);
		t.add("ORANIUM");
		t.add("PHYSICS");
		t.add("CHEMISTRY");
		t.add("BIOLOGY");
		t.add("MATHS");
		t.add("ORANIUM");
		
		System.out.println(t);
		
		//using lamda expression
		
		t.forEach(r->System.out.println(r));
		
		//using iterator
		
		Iterator<String> u = t.iterator();
		
		while(u.hasNext())
		{
			
			System.out.println(u.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
