package Assign31JanAnd1Feb.MRP_NStoS_SameClass;
class Trapezoid
{
    double value(int a,int b, int c)
    {
        return (a+b)/2*c;
    }
    public static void main(String[] args)
    {
        System.out.println("Area of Trapezoid: " + new Trapezoid().value(2,3,4));
    }
}