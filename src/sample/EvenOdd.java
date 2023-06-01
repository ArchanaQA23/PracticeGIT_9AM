package sample;

public class EvenOdd {
	
	
	
	public void evenOddCheck()
	{
		for(int num=1 ; num<=100; num++)  
		{
			if(num%2==0)           
			{
				System.out.println(num +" is an even number ");
			}
			else
			{
				System.out.println(num + " is an odd number ");
			}
		}
	}
	
	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		e.evenOddCheck();
		
	}

}
