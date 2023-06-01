package CalcTwo;

import CalcOne.DemoOne;

public class CalcThree extends DemoOne {
	
	
	public static void main(String[] args) {
		
		CalcThree c = new CalcThree();
		
		c.addNumber();//public
		//c.subNumber();//private
		
		c.mulNumber();//protected
		//c.divNumber();//default
		
	}

}
