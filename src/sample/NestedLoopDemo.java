package sample;

public class NestedLoopDemo {
	
	
	public void starPattern()
	{
		for(int row=1; row <=5; row++)    //row =2   2<=5 
		{
			for(int col=1; col<=5; col++)   //col =2  2<=5
			{
				if(row==1 ||row==5 ||col==1 || col==5)     
					                                         
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				                         
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NestedLoopDemo n = new NestedLoopDemo();
		n.starPattern();
	}

}
