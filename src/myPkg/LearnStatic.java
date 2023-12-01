package myPkg;

public class LearnStatic 
{
	static int i = 20;
	
	public static void printText()
	{
		
		System.out.println(i);
		System.out.println("this is simple method to print text");
	}
	
	public void meth2()
	{
		System.out.println("this is non static method");
	}
	
	
	public static void main(String[] args) {
		
		LearnStatic ls = new LearnStatic();
		ls.meth2();
		
		LearnStatic.printText();
		
		
	}
	
}
