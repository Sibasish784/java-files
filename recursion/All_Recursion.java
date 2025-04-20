package recursion;

import java.util.Scanner;

//Print only Even Numbers in 1 to 10 By using Recursion Method 

class OnlyEven1To10
{
	static void onlyEven(int a)
	{
		if (a<10)
		{
			if (a%2==0)
			{
				System.out.println(a);
			}
			a++;
			onlyEven(a);
		}
	}
}

//Print only Odd Numbers in 1 to 10 By using Recursion Method

class OnlyOdd1to10
{
	static void onlyOdd(int a)
	{
		if (a<10)
		{
				if (a%2!=0)
				{
					System.out.println(a);
				}
			a++;
			onlyOdd(a);
		}
	}
}

class Factorial
{
	static long fact = 1;
	static void factorial(long f)
	{
		if (f>=1)
		{
	    	fact=fact*f;
		    f--;
		   factorial(f);
		}
		else
		{
			System.out.println("Now f = " +f);
		}	
	}
}



class All_Recursion
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Only even numbers in the RANGE OF 1 TO 10: ");
		OnlyEven1To10.onlyEven(1);
		System.out.println("Only odd numbers in the RANGE OF 1 TO 10: ");
		OnlyOdd1to10.onlyOdd(1);
		System.out.println("Enter a number for Factorial: ");
		 int anumb = scanner.nextInt();
		 scanner.close();
		Factorial.factorial(anumb);
		System.out.println("Finding The Factorial Of a Number: ");
		System.out.println(Factorial.fact);
	}

}
