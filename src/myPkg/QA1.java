package myPkg;

public class QA1 
{
	int i = 500;

	public  void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	
	
	public static void main(String[] args) 
	{
	
		QA1 q1 = new QA1();
		
		q1.sum(10, 20);
		
		
	}
	
}
