package Recursion_Recursive_method;
class OnlyEven
{
	void even(int a)
	{
		if (a< 10)
		{
			if (a %2 ==0)
				{
					System.out.println(a);
				}
			a++;
			even(a);
		}
	}

	public static void main(String[] args)
	{
		OnlyEven e = new OnlyEven();
		e.even(1);
	}
}