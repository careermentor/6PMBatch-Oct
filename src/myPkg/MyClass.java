package myPkg;

public class MyClass 
{

	
	//these are different data types

	int i=10;
	float j = 10.5f;
	char k = 'A';
	String l = "Java";
	boolean m = true;
	
	
	public void printVar()
	{
		
	
		
		System.out.println(i);
		System.out.println(j);   //syso -> ctrl+space
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
	}
	
	
	public static void main(String[] args) 
	{
		MyClass abc = new MyClass();   //this is the way to create object of the class
		
		abc.printVar();
		
	}
	
	
}