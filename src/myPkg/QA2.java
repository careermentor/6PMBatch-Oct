package myPkg;

public class QA2 extends QA1
{
	
	int i = 100;
	
	public void printVal()
	{
		final int i = 200;
		//i=300;
		
		System.out.println(i); //200
		System.out.println(this.i);//100
		System.out.println(super.i); //500
		
		super.sum(20, 30);
		
	}
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sub(20, 30);
		q2.sum(20, 30);
		q2.printVal();
		
	}

	
	public void QA1IM() {

		System.out.println("this is method of QA1I");
		
	}
	
}
