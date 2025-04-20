package recursion;

public class PrintDigitsOneByOneUsingMethodWithReturnAndParaByWhile 
{
    
    static void printDigits(int n){
        while (n > 0) 
        {
            int digit = n % 10; 
            System.out.println(digit); 
            n = n / 10;
        }
    }
    public static void main(String[] args) 
    {
        int n = 12345; 
        System.out.println("Digits of " + n + " are: ");
        printDigits(n);
    }
}
