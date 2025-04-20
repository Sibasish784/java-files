package LogicalAprilFive;

import java.util.Scanner;

public class HowManyNonPrimeNumbersInArray
{

    static void isNotPrime(int n) 
    {
        for(int i = 2; i <=n-1; i++) 
        {
            if (n%i == 0) 
            {
                System.out.println("Is not prime");
            }
        }
        System.out.println("prime");
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        isNotPrime(scanner.nextInt());

    }
}
