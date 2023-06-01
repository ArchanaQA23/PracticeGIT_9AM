package sample;

public class SonHome extends ParentHome {
	
	
	public void whatsApp()
	{
		
		System.out.println("Sons Whats App");
		
	}

	
	public static void main(String[] args) {
		
		SonHome s = new SonHome();
		
		s.whatsApp();//son
		
		s.whatsApp();//father
		
	}
}
