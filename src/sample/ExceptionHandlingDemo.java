package sample;

public class ExceptionHandlingDemo {
	
	
	int a=10;
	int b=0;
	
	String s;
	
	int d[] = {23,42,56,78};
	
	public void demoException()
	{
		System.out.println("Hi this is Starting Point");
	
		
		try
		{

			System.out.println(d[5]);
				
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
//		try
//		{
//			
//			System.out.println(s.length());
//				
//		}
//		
//		catch(Exception e)
//		{
//			
//			e.printStackTrace();//it will provide the complete log
//			
//		}
//		
//		try
//		{
//			
//			System.out.println(a/b);//exception
//		}
//		
//		catch(Exception e)// Exception--> arithmetic, niull, array
//		{
//			
//			e.printStackTrace();
//		}
		
		System.out.println("Hi this is Ending Point");
		
	}
	
	public static void main(String[] args) {
		
		ExceptionHandlingDemo e = new ExceptionHandlingDemo();
		e.demoException();
	}

}
