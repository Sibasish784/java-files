package Array.OperationsInArray;
class MPArrayLarge 
{

	static void calc (int [] ar)
	{
		int large = ar[0];
		for (int i = 0;i <ar.length;i++)
		{
			if (ar[i]>large)
			{
				large = ar[i];
			}
		}
		System.out.println(large);	
	}
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40};
		calc(arr);
	}
}
