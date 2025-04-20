package recursion;

public class NumberPallindromeUsingReturnTypeBYBOOLEANByWhile 
{
    static boolean check()
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
        return(temp == isPalindrome);
    }
    public static void main(String[] args) {
		System.out.println(check());
	}
}
