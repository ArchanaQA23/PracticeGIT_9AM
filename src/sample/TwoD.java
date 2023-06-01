package sample;

public class TwoD {
	
	int tarr  [ ] [ ]= { {10,20,30}, 
			
		                  {40,50,60,67,90}, 
			              {70,80,90,89,90,90 }          
			};

	
	
	
	
	public void checkTwoArray()   
	{
		//Accessing the elemnts 
		System.out.println(tarr[0][1]);
		System.out.println(tarr[2][2]);
		
		 //Number of rows
		System.out.println(tarr.length);   // 3
		
		//Number of columns 
		System.out.println(tarr[2].length);  //6 
		
		System.out.println("Using normmal for loop ");
		for (int row =0; row<tarr.length; row ++)
		{
			for(int col=0 ; col<tarr[row].length; col++)
			{
				System.out.print(tarr[row][col]+" ");
			}
			System.out.println();
				
		}
		
		System.out.println("Using enhanced for loop ");
		
		// {10,20,30} 
		
		
		
		for(int[] k: tarr)
		{
			for(int a:k)
			{
				System.out.print(a +" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		TwoD t = new TwoD();
		t.checkTwoArray();
		
	}

}
