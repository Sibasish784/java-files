package logics.PrimeNumber.TeraFeb;
class PrimeNo1to10
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 10; i++) 
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
                System.out.println(i);
            }
        }
    }
}