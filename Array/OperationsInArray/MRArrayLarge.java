package Array.OperationsInArray;
class MRArrayLarge 
{

	static int calc ()
	{
		int [] arr = {10,20,30,40};
		int large = arr[0];
		for (int i = 0;i <arr.length;i++)
		{
			if (arr[i]>large)
			{
				large = arr[i];
			}
		}
		return large;
	}
	public static void main(String[] args) 
	{
		System.out.println(calc());
	}
}
