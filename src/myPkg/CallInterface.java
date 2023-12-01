package myPkg;

public class CallInterface implements MyInterface
{

	
	public void meth3() {
	
		System.out.println("this is interface of Meth3");
		
	}
	
	public void meth4()
	{
		System.out.println("this is simple method meth4");
	}

	public static void main(String[] args) {
		CallInterface ci = new CallInterface();
		ci.meth3();
		ci.meth4();
	}
	
}
