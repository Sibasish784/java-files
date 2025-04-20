package Assign31JanAnd1Feb.MRP_NStoS_SameClass;
class Parallelogram
{
    int area(int x, int y)
    {
        return x*y;
    }

    public static void main(String[] args)
    {
        System.out.println(new Parallelogram().area(10,20));
    }
}