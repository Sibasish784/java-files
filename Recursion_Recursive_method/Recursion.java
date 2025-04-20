package Recursion_Recursive_method;
class Recursion
{
	static int a = 1;

	static void factorial(int n)
	{
			if (n>=1)
			{
				a*=n;
				n--;
				factorial(n);
			}

	}


	public static void main(String [] args)
	{
	

		factorial(10);
		System.out.println(a);

	}
}