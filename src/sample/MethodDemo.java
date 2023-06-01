package sample;

public class MethodDemo {
	int a =90, b =67; 
	
	public int add ()   /// method name with parameters 
	{
		
	return a+b; 
	}
	
	
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		int sum = m.add(); 
		System.out.println(sum);
		
		
	}

}
