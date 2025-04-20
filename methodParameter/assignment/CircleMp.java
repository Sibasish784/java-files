package methodParameter.assignment;
class CircleMp
{
    static void area(int b)
    {
         final double a = 3.142;
        System.out.println("The area of Circle = "+a * b * b);

    }

    public static void main(String[] args) {
        area(6);
        area(7);
        area(99);
    }
}