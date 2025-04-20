package LogicalAprilFive;

public class HowManyPrimeNumbersInArray 
{
    public static boolean check(int n)
    {
        int count = 0;
        
        for(int i = 1; i <=n; i++)
        {
            if (n%i == 0)
            {
                count++;
            }
        }
        return count == 2;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int primeCount = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (check(arr[i]))
            {
                primeCount++;
            }
        }
        System.out.println("Number of prime numbers in the array: " + primeCount);
    }
}
