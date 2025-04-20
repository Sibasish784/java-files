package Calling_Passing.PassByReference;

class SameClass
{
	void disp()
	{
		System.out.println("This is the Final Output in same class");
	}

	static void print(SameClass x)
	{
		x.disp();
	}

	public static void main(String[] args)
	{
		SameClass obj = new SameClass();
		print(obj);
	}
}
