package sample;

public class SumOf10Nos {
	
	
	public void checkSum()                 
	{
		int sum=0 ;
		
		for(int num=1 ; num<=10 ; num++)    
		{
			sum =  sum+num;   
			
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		SumOf10Nos s = new SumOf10Nos ();          
		s.checkSum();            
		
	}

}
