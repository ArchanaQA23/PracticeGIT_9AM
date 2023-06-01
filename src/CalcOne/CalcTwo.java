package CalcOne;

public class CalcTwo extends DemoOne {
	
	
	public static void main(String[] args) {
		
		CalcTwo c = new CalcTwo();
		
		c.addNumber();//public
		//c.subNumber();//private
		
		c.mulNumber();//protected
		c.divNumber();//default
		
	}

}
