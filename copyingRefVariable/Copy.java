class Copy
{
    int a = 10;
    public static void main(String[] args)
    {
        Copy c1 = new Copy();
        Copy c2 = new Copy();
        c2.a = c1.a;
        c1.a = 20;
        System.out.println(c2.a);
    }
}
