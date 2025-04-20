package recursion;

public class SumOfDigitsUsingMethodWithParaAndReturnTypeByWhile 
{
    public static void main(String[] args) 
    {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }

    public static int sumOfDigits(int n) 
    {
        int sum = 0;
        while (n > 0) 
        {
            sum += n % 10; // Add the last digit to the sum
            n /= 10; // Remove the last digit from the number
        }
        return sum;
    }
}
