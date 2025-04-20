package methodReturnType;
class Parallelogram
{
    static int area()
    {
        int a = 78;
        int b = 45;
        int d = a*b;

        return d;
    }

    public static void main(String[] args)
    {
        System.out.println("Area of Parallelogram is: " + area());
    }
}