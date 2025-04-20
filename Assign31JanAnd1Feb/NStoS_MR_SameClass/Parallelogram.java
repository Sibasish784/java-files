package Assign31JanAnd1Feb.NStoS_MR_SameClass;
class Parallelogram
{
    int area()
    {
        int x = 10; 
        int y = 16;
        return x*y;
    }

    public static void main(String[] args)
    {
        System.out.println(new Parallelogram().area());
    }
}