package Assign31JanAnd1Feb.StoS2class;
class Dummy
{
    static void area()
        {
        double base = 20.0;
        double height = 110.5;
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle is: " + area);
        }
}

class Triangle
{
        public static void main(String[] args)
        {
                Dummy.area();
        }
}