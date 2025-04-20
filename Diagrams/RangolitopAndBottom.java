package Diagrams;
class RangolitopAndBottom
{
    public static void main(String[] args) 
    {
        int i = 6;
		int space = i-1;
		int star = 1;
		for (int a =1;a<=i;a++)
		{
			for (int j = 1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int k =1;k<=star;k++)
			{
				System.out.print(" *");
			}
		System.out.println();
		space --;
		star++;
		}
    }
}