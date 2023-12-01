package myPkg;

public class FirstClass
{

	public void meth1()
	{
		System.out.println("this is meth1");
	}
	
	public void meth2()
	{
		System.out.println("this is meth2");
	}
	
	
	public FirstClass(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		System.out.println("this is constructor");
	}
	
	
	public static void main(String[] args) 
	{
	
		
		FirstClass fc = new FirstClass(20,30);  //constructor will be automatically called
												//if you have parameter in the constructor, 
												//will have to pass value while creating object of the class
		
		fc.meth1();
		fc.meth2();
		
	}
	
}
