package sample;

public class DemoStaticBlock {
	
	String sname;
	int sid;
	static String cname;
	
	static
	{
		cname="Oranium";
		
		System.out.println("Hi this is Static Block");
		
	}
	
	public static void print()
	{
		
		System.out.println("Hi this is static method");
	}
	
	public void demoStatic(String a, int b)
	{
		sname=a;
		sid=b;
		
		
		System.out.println("Student Name is:"+sname);
		System.out.println("Student id is:"+sid);
		System.out.println("Student College Name is:"+cname);
		
		
		
	}

	public static void main(String[] args) {
		
		print();
		DemoStaticBlock.print();
//		DemoStaticBlock d = new DemoStaticBlock();
//		d.demoStatic("Sivakumar", 1);
//		d.demoStatic("Amsapriya", 2);
//		
	}
}
