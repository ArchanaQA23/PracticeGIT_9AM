package sample;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder ("welcome");
		
		System.out.println(s+"guys ");
		
		System.out.println(s);
		
		s.append("Tech"); 
		
		System.out.println(s);
		
		s.reverse();
		
		System.out.println(s);  // hceTemoclew
		
		s.insert(0, "ran");
		
		System.out.println(s);
		
	}

}
