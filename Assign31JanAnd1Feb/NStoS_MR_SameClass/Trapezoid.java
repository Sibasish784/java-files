package Assign31JanAnd1Feb.NStoS_MR_SameClass;
class Trapezoid
{
    double value()
    {
        int a= 10; int b = 20; int c = 30;
        return (a+b)/2*c;
    }
    public static void main(String[] args)
    {
        System.out.println("Area of Trapezoid: " + new Trapezoid().value());
    }
}