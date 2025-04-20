class MPArraySmall 
{

	static void calc (int [] ar)
	{
		int small = ar[0];
		for (int i = 0;i <ar.length;i++)
		{
			if (ar[i]<small)
			{
				small = ar[i];
			}
		}
		System.out.println(small);	
	}
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40};
		calc(arr);
	}
}
