package logics.PrimeNumber;
class PrimeNumberByParaAndReturn
{
	static int count = 0;
    static String calc(int A)
    {
		
        for(int i=1; i<=A; i++)
        {
            if(A%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            return "Prime";
        }
        else
        {
			return "Not a Prime";
		}
    }
        public static void main(String[] args)
        {
            String result = calc(5);
            System.out.println("Result is: "+result);
        }
}