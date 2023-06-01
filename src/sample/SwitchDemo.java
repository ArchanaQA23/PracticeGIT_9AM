package sample;

public class SwitchDemo {
	
	String proof = "passport"; 
	
	public void checkSwitch()
	{
		
		switch(proof)
		{
		case "aadhar":
			System.out.println( proof+   " is a valid proof to open the bank account");
			break; 
			
		case "pan" :
			System.out.println( proof+   " is a valid proof to open the bank account");
			break; 
			
		case "ration card": 
			System.out.println( proof+   " is a valid proof to open the bank account");
			break; 
			
			default: 
				System.out.println("Provide a valid proff!!!");
				
				break;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		SwitchDemo s =new SwitchDemo();
		s.checkSwitch();
		
	}

}
