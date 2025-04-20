package methodCalling.assignment;
class TrapezoidMc
{
    static void area()
    {
        int h = 12;
        int a = 2;
        int b = 4;
        double area = 0.5*(a+b) *h;
        System.out.println("The area of Trapezoid = "+area);
    }

    public static void main(String[] args)
    {
        area();
    }
}
