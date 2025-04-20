package methodParameter.assignment;
class EllipseMp
{
    static void area(int a, int b)
    {
        final double pi = 3.14159;
        System.out.println("The area of Ellipse = "+pi * a * b);
    }

    public static void main(String[] args) {
        area(5, 3);
        area(10, 6);
        area(7, 2);
    }
}