package logics.PrimeNumber;
class CallingPrime
{
    static void calc()
    {
			int count = 0;
			int A = 7;

        for(int i=1; i<=A; i++)
        {
            if(A%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
             System.out.println("prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
        public static void main(String[] args)
        {
			calc();
        }
}