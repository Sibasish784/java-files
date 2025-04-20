package hackerrank;

public class Abc
{
	public static void main(String[] args)

	{
		int n = 5; 
		int Star =1; 
		int Space = n-1;

		for (int k = 1; k<=n;k++)
		{
			for (int i = Space;i>=1;i++)
			{
				System.out.print(" ");
			}
			for (int j =1;j<=Star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			Star++;
			Space--;
		}	
	}
}