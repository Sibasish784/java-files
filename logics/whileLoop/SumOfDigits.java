package logics.Whileloop;
class SumOfDigits {
    public static void main(String[] args) {
        int a = 100;
        int sum = 0;
        while (a != 0) 
        {
            int remainder = a % 10;
            sum = sum + remainder;
            a = a/10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
