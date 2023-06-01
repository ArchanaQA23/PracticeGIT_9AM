package CalcTwo;

public class DemoConstructorProgram extends ParentClassConstructor {
	
	
	int a;//global variable
	int b;
	
	DemoConstructorProgram() {
		
		this(40,50);
		
		a=10;
		b=20;
		
		System.out.println(a+b);
		
	}
	
	DemoConstructorProgram(int a, int b)//local variable
	{
		this(20, 45.34f);
		
		System.out.println(a-b);
		
	}
	
	DemoConstructorProgram(int a, float b)
	{
		
		this(34.32f,30);
		System.out.println(a*b);
		
	}
	
	DemoConstructorProgram(float a, int b)
	{
		super(20,34.5f);
		
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		
		DemoConstructorProgram d = new DemoConstructorProgram();
		
//		DemoConstructorProgram d1 = new DemoConstructorProgram(30, 40);
//		
//		DemoConstructorProgram d2= new DemoConstructorProgram(30, 43.32f);
//		
//		DemoConstructorProgram d3= new DemoConstructorProgram(34.23f, 23);
		
	}

}
