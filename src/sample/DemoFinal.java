package sample;

public class DemoFinal {
	
	final int a=1000;
	
	public void demoFinal()
	{
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		
		DemoFinal d = new DemoFinal();
		d.demoFinal();
		
		d.a=2000;
		
		System.out.println(d.a);
	}

}
