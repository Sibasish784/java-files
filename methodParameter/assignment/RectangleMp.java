package methodParameter.assignment;
class RectangleMp
{
    static void area(int w, int h)
    {
        System.out.println("The area of Rectangle = "+w * h);
    }

    public static void main(String[] args) {
        area(5, 3);
        area(10, 2);
        area(6, 8);
    }
}