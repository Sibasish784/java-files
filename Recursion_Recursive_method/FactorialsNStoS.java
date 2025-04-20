package Recursion_Recursive_method;
class Fact
{
	int facto = 1;
	void calc(int f)
	{
		if (f >=1)
		{
			facto = facto*f;
			f--;
			calc(f);
		}
	}

}

class FactorialsNStoS
{
	public static void main(String[]agrs)
	{
		Fact S = new Fact();
		S.calc(5);
		System.out.println(S.facto);

	}
}