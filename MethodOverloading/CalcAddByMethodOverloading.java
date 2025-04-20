package MethodOverloading;
class CalcAddByMethodOverloading 
{
    static void add(int a, int b)
    {
        System.out.println("Sum: "+(a+b));
    }
    static void add(int a, double b)
    {
        System.out.println("Sum: "+(a+b));
    }
    static void add(double b, int a)
    {
        System.out.println("Sum: "+(b+a));
    }
    static void add(double a, double b)
    {
        System.out.println("Sum: "+(a+b));
    }
    public static void main(String[] args)
    {
        add(1, 2);
        add(1, 2.5);
        add(2.5, 1);
        add(10.12, 5.12);
    }

}
