class Factorial5OnlyCalling
{
    static void facto()
    {
        int a = 5;
        int fact = 1;
        for(int i = 1; i <= a; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + a + " is " + fact);
    }

    public static void main(String[] args)
    {
        facto();
    }
}