package methodParameter.assignment;
class ParallelogramMp
{
    static void area(int b, int h)
    {
        System.out.println("The area of Parallelogram = "+b * h);
    }

    public static void main(String[] args) {
        area(5, 3);
        area(10, 4);
        area(7, 2);
    }
}