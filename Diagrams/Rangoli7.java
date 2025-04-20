package Diagrams;
class  Rangoli7
{
	public static void main(String[] args) 
	{
		int n=4;
		int space=n-1;
		int star=1;
		for (int i=1;i<=n ;i++ )
		{
			for (int k=space;k>=1 ;k-- )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print(" * ");
			}
			System.out.println();
			star++;
			space--;
		}
		
	}
}
