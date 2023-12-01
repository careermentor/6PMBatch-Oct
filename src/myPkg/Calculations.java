package myPkg;

public class Calculations 
{

	int a =100;   //global variable
	
	
	public void printVal()
	{
		
		final int a = 20;  //local variable //constant
		//a=50;
		int b = 30;
		b=60;
		
		int c = a+b;
		System.out.println("Sum of a&b: " + c);
	}
	
	
	
	
	public void printText()
	{
		System.out.println(a);
		System.out.println("this is public method");
	}

	public static void main(String[] args)
	{
	
		Calculations cal = new Calculations();
		cal.printVal();
		
	}
	
	
}
