package sample;

public class ArrayDemo {

	
	int  arr[]  = {10,20,30,40,50,60 };
	
	public void arrayCheck()
	{
		//Accessing the elemnts
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[5]);
		
		// Number of elements in an array 
		System.out.println(arr.length);  // 6
		
		
		System.out.println("Using for loop ");
		
		for (int i=arr.length; i>=3; i--)  // i=2   2<6
		{
			System.out.println(arr[i]);   //arr[2]
		}
		
		System.out.println("Enhanced for loop ");
		//unidirectional loop 
		
		for(int k: arr)
		{
			System.out.println(k);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		ArrayDemo a= new ArrayDemo();
		a.arrayCheck();
	}
}
