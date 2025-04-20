class Factorial
{
    static void facto(int a)
    {
        int fact = 1;
        for(int i = 1; i <= a; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + a + " is " + fact);
    }

    public static void main(String[] args)
    {
     for (int i = 1; i <= 5; i++)
     {
         facto(i);
     }
    }
}