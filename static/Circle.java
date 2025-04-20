class Demo {
    final static double PI = 3.142;
    static void area()
    {
        int r = 5;
        double area = PI * r * r;
        System.out.println("Area of circle is: " + area);
    }
}

class Circle {
    public static void main(String[] args)
    {
        Demo.area();
    }
}
