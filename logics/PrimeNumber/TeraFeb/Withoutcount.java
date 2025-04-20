package logics.PrimeNumber.TeraFeb;
class Withoutcount
{
    static void isPrime()
	{
		for (int i = 2;i<4;i++ )
		{
			if (4%i == 0)
			{
				System.out.println("Not Prime");
				return;
			}
		}
	System.out.println("Prime");
	}
public static void main(String[]args)
	{
		isPrime();
	}
}