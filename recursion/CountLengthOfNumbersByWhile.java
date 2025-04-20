package recursion;

public class CountLengthOfNumbersByWhile 
{
    public static void main(String[] args) {


    int a = 17280;
    int count = 0;
    while (a > 0) 
    {
        int rem = a % 10;
        a = a / 10;
        count++;
    }

    System.out.println("Length of number is: " + count);
    }
}
