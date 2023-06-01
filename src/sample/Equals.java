package sample;

public class Equals {
	
	public static void main(String[] args) {
		
		String s = "oranium";    // string literal ---> scp 
		
		String s1 = new String ("oranium");  //  --> heap memory 
		
		System.out.println(s.equals(s1));   //true  
		
		System.out.println(s==s1);   //false
	}

}
