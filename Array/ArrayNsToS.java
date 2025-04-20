package Array;
class ArrayNsToS
{
	void dummy()
	{
//		int [] arr1 = new int [5];
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
//		arr1[3] = 40;
//		arr1[4] = 50;
		int [] arr1 = {10,20,30,40,50};
		for (int i = 0;i <= arr1.length-1;i++)
		{
			if(arr1[i]%2==0)
			{
				System.out.println(arr1[i]);
			}
		}
	}

	public static void main (String [] args)
	{
		ArrayNsToS ants = new ArrayNsToS();
		ants.dummy();
	}
}