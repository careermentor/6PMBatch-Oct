package otherPkg;

import myPkg.Calculations;
import myPkg.FirstClass;

public class CallCal 
{
	public static void main(String[] args)
	{
	
		Calculations cal = new Calculations();
		
		
		cal.printVal();
		cal.printText();
		
		FirstClass fc = new FirstClass(20,30); 
		
	}
	
}
