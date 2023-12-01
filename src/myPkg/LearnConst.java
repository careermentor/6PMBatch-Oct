package myPkg;

public class LearnConst 
{
	public void printst()
	{
		System.out.println("this is simple method");
	}
	
	
	public int sqrt(int a)
	{
		int b = a*a;
		System.out.println(b);
		return b;
	}
	
	public LearnConst(int a)
	{
		System.out.println("this is constructor");
	}
	
	public LearnConst(int a, int b)
	{
		
		int c = a-b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args)
	{
		LearnConst abc = new LearnConst(10);  //object of the class. Constructor will be automatically
		
		abc.printst();
		abc.sqrt(20);
		
	}
	
	
	
}
