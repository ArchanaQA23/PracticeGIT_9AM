package sample;

public class LoopDemo {
	
	public void printNums()
	{
		for (int num=1; num<=10; num++)
		{
			System.out.println(num);
		}
		System.out.println("Outside the loop");
		
		
	

	}
	
	public static void main(String[] args) {
	LoopDemo l = new LoopDemo();
	l.printNums();
	}

}
