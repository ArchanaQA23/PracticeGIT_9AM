package sample;

public class NestedIfDemo {
	
	   int num= 13;
	  public void checkNestedIf()
	  {
		  if(num%2==0)   
		  {
			  System.out.println(num + " is completely diviisble by 2");
			  if(num%4==0)
			  {
				  System.out.println(num + " is completely diviisble by 4");
				  if(num%8==0)
				  {
					  System.out.println(num + " is completely diviisble by 8");
					  if(num%16==0)
					  {
						  System.out.println(num + " is completely diviisble by 16");
					  }
				  }
			  }
			  else
			  {
				  System.out.println(num + " is not completely diviisble by 4");
			  }
			  
		  }
		  else
		  {
			  System.out.println(num +" is not completely divisible by 2");
		  }
		  
		  
		  
		  
	  }
	
	
	public static void main(String args[])
	{
		 NestedIfDemo n = new  NestedIfDemo();
		 n.checkNestedIf();
		 
	}

}
