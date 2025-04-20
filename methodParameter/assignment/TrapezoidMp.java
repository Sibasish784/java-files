package methodParameter.assignment;
class TrapezoidMp
{
    static void area(int a, int b, int h)
    {
        System.out.println("The area of Trapezoid = "+0.5 * (a + b) * h);
    }

    public static void main(String[] args) {
        area(5, 3, 2);
        area(10, 6, 4);
        area(7, 2, 3);
    }
}