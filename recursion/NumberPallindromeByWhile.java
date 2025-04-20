package recursion;

public class NumberPallindromeByWhile 
{
    public static void main(String[] args) 
    {
        int number = 12321;
        int  isPalindrome =0;
        int temp = number;
        while (number > 0) 
        {
            int digit = number % 10; 
            isPalindrome = (isPalindrome*10) + digit; 
            number = number / 10;
        }
        if (temp == isPalindrome) 
        {
            System.out.println(temp + " is a palindrome number.");
        } 
        else 
        {
            System.out.println(temp + " is not a palindrome number.");
        }
    }
}
