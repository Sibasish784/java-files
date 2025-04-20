package Array;
class ArrayNsToSOdd
{
	void dummy()
	{
		int [] arr1 = {1,2,3,4,5};
		for (int i = 0;i <= arr1.length-1;i++)
		{
			if(arr1[i]%2!=0)
			{
				System.out.println(arr1[i]);
			}
		}
	}

	public static void main (String [] args)
	{
		ArrayNsToSOdd ants = new ArrayNsToSOdd();
		ants.dummy();
	}
}