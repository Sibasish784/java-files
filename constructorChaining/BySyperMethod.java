package constructorChaining;

public class BySyperMethod extends SecondCon
{
	public BySyperMethod()
	{
		super();
		System.out.println("Kid One");
	}
	
	public static void main(String[] args) 
	{
		BySyperMethod a = new BySyperMethod();
		System.out.println(a);
		//abstract method call
		a.add();
	}
}

