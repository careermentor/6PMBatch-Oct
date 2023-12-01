package myPkg;

public class CallAbsClass extends LearnAbsClass
{

	
	public void meth2() 
	{
		
		System.out.println("this is my personal data");
		
	}

	public static void main(String[] args) {
		
		CallAbsClass cac = new CallAbsClass();
		cac.meth1();
		cac.meth2();
	}
	
}
