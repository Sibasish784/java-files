package Assign31JanAnd1Feb.MRP_NStoS_SameClass;
class Triangle
{
	double area(int a, int b)
	{
		return 0.5*a*b;
	}

	public static void main(String[]args)
	{
		System.out.println(new Triangle().area(3, 6));
	}
}
