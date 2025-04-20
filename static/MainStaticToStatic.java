class MainStaticToStatic 
{
    static int a = 10;
    static int b = 11;
    static void add()
    {
        System.out.println(a+b);
    }

    public static void main(String[] args)
    {
        add();
    }
}
