class SumOfPrimeNumbers
{
    static void sum(int a)
    {
        int Add = 0;
    for (int i = 1; i <= a; i++) 
        {
            int count = 0;
            for (int j = 1; j <= i; j++) 
            {
                if (i % j == 0) 
                {
                    count++;
                }
            }
            if (count == 2) 
            {
                Add=i+Add;
            }
        }
        System.out.println(Add);
    }


    public static void main(String[] args) 
    {
        sum(10);
    }
}