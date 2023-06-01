package CalcTwo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList();
		
		//add
		
		a.add("ORANIUM");
		a.add(true);
		a.add(343.43f);
		a.add(null);
		a.add("ORANIUM");
		a.add('c');
		a.add(56767);
		
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.get(2));
		
		//using normal for loop
		
		for(int i=0;i<a.size();i++)

		{
			
			System.out.println(a.get(i));
		}
		
		//using enhanced for loop
		
		System.out.println("============");
		
		for(Object u:a)
		{
			
			System.out.println(u);
		}
		
		
		System.out.println("============");
		//using lamda expression
		
		a.forEach(q->System.out.println(q));
		
		//iterator
		
		
		Iterator<Object> e = a.iterator();
		
		
		
		while(e.hasNext())// next line
		{
			
			System.out.println(e.next());
			
		}
		
		
		
		
		
		
		
		
//		System.out.println(a.removeAll(a));
//		
//		System.out.println(a.isEmpty());
		
		
		
		
		
		
		
		
	}

}
