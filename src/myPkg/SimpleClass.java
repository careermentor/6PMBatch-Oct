package myPkg;

public class SimpleClass 
{
	
	
	

	public float sum()  // no parameters/arguments
	{
		int a = 20;
		float b = 30.5f;
		float c = a+b;
		
		System.out.println("sum of a&b =  " + c);
		
		return c;
		
	}
	
	public int sums(int a, int b)   //with parameter/arguments
	{
		int c = a+b;
		
		System.out.println("sum of a&b =  " + c);
		return c;
		
		//10+20+30
		//x = 10+20
		//x+30
		
	}
	
	public void mul()
	{
		int a = 20;
		int b = 30;
		int c = a*b;
		
		System.out.println("mul of a&b =  " + c);
		
	}
	
	public void multiplication(int a, int b)
	{
		int c = a*b;
		
		System.out.println("mul of a&b =  " + c);
		
	}
	
	public static void main(String[] args) 
	{
		SimpleClass sc = new SimpleClass();
		sc.sum();
		
		int x = sc.sums(50, 100);
		sc.sums(x, 200);
		
		
		
		sc.sums(75, 35);
		sc.mul();
		sc.multiplication(25, 35);
		
		
	}
	
	
	
	
	
}
