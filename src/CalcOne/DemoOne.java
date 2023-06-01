package CalcOne;

public class DemoOne {
	
	
	public void addNumber()
	{
		
		System.out.println("This is Public Access modifier");
	}
	
	private void subNumber()
	{
		
		System.out.println("This is Private Access Modifier");
	}
	
	protected void mulNumber()
	{
		
		System.out.println("This is Protected Access Modifier");
	}
	 
	void divNumber()
	{
		
		System.out.println("This is Default Access Modifier");
	}

	public static void main(String[] args) {
		
		
		DemoOne d = new DemoOne();
		d.addNumber();//public
		d.subNumber();//private
		d.mulNumber();//protected
		d.divNumber();//default
		
	}
	
}
