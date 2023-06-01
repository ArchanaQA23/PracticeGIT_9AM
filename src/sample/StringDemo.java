package sample;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s ="oraniumi";       // string literal --> SCP 
		String s1="ORANIUM";
		
		String s2= "Welcome java programming";
		
		System.out.println(s.contains("ran"));   //true 
		
		System.out.println(s.toUpperCase());     // ORANIUM
		
		System.out.println(s1.toLowerCase());  //oranium
		
		System.out.println(s.indexOf("i"));     //first occurence 
		
		System.out.println(s.lastIndexOf("i"));  //last occurence
		
		System.out.println(s.charAt(5));    // u
		
		System.out.println(s.substring(1));  // raniumi
		
		System.out.println(s.substring(1, 5));  
		
		System.out.println(s.equals(s1));  //false 
		
		System.out.println(s.startsWith("oran"));        // true
		
		System.out.println(s.endsWith("good"));    //false 
		
		//{ 'o',     'r',    'a',     n    i }
		char[] arr = s.toCharArray();
		
		for (int i =0 ; i< arr.length; i++)  //i =0   0 < 7
		{
			System.out.println(arr[i]);
		}
		
		// {"welcome", "java", "programming"} 
		String[] split = s2.split(" ");
		
		System.out.println("Using normal for loop");
		
		for ( int a=0; a <split.length; a++ )
		{
			System.out.println(split[a]);
		}
		
		
		System.out.println(s.replace('u', 'o'));

		
		System.out.println(s);    // oraniumi
		
		
		
		
	}

}
