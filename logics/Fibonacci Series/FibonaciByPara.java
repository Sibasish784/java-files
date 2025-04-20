class FibonaciByPara
{
    static void calc(int a, int b, int c)
    {
        for(int i = 0; i < c; i++)
        {
            int n = a + b;
            System.out.print(n + " ");
            a = b;
            b = n;
        }
    }
    
    public static void main(String[] args)
    {
        int a = 0, b = 1, c = 10;
        System.out.print(a + " " + b + " ");
        calc(a, b, c);
    }    
}