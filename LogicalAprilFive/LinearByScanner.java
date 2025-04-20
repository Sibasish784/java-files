package LogicalAprilFive;

import java.util.Scanner;

public class LinearByScanner {
	public static boolean linearSearch(int x)
    {
        int count = 0;

        for (int i = 0; i <x; i++)
        {
            if (x == 2)
            {
                count++;
            }
        }
            if (count == 2)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public static void main(String[] args) 
    {
        int count = 0;
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++)
        {
            if (x == arr[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
