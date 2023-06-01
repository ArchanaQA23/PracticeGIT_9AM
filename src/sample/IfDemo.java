package sample;

public class IfDemo {
	
	int a=20, b=5;
	
	
	public void checkIf()
	{
		if (a<=b)   // 20<=5 
		{

		System.out.println("A is greater than or Equal to B");

		}
		else
		{
			System.out.println("A is lesser than or equal to B");
		}
	
	}
	
	public static void main(String[] args)    
	{
	IfDemo i = new IfDemo();   //oc 
	i.checkIf();       //mcuo
	
	}

}
