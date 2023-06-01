package sample;

public class OperatorsDemo {
	
	   int a=25 , b =5;
	
	   public void arithmeticOps()
	   {
		   System.out.println("****ARITHMETIC OPERATOR****");
		   System.out.println(a+b);  // 30
		   System.out.println(a-b);   // 20
		   System.out.println(a*b);  // 125 
		   System.out.println(a/b);  // 5
		   System.out.println(a%b);  // 0
	   }
	
	   
	   public void relationalOps()
	   {
		   System.out.println("***RElational Operator***");
		   System.out.println(!(a<b));    // 25 <5   false 
		   System.out.println(a>b);    // 25>5    true 
		   System.out.println(a<=b);    // 25<=5   false
		   System.out.println(a>=b);   //25>=5    true 
		   System.out.println(a==b);   // 25==5   false
		   System.out.println(a!=b);   //25!=5    true 
	   }
	   
	   public void conditionalOps()
	   {
		   System.out.println((a==b) ?  "A is equal to B" : " A is  not equal to B  " );
	   }
	   
	   public  void incDecOps()
	   {
		   int a =10 ;     // local variable 
		   System.out.println(a++);   //10 
		   System.out.println(a);     //11
		   System.out.println(++a);    //12
		   
		   System.out.println(a--);     //12
		   System.out.println(a);        //11
		   System.out.println(--a );    //10 
	   }
	   
	   public void concatOps()
	   {
		   String s ="Oranium";
		   System.out.println(s + " Tech");
	   }
	   
	   public void shortOps()
	   {
		   int a =10, b =20  ;
		   
		   a*= b;    //  a= a+b
		   System.out.println(a);
		 
	   }
	
	public static void main(String args[])
	
	{
		OperatorsDemo o = new OperatorsDemo();
		o.arithmeticOps();
		o.relationalOps();
		o.conditionalOps();
		o.incDecOps();
		
		o.shortOps();
		o.concatOps();
	}

}
