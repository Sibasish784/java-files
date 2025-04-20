class Circle
{
    double area(int r)
    {
        return 3.124*r*r;
    }
} 

class CircleArea
{
    public static void main(String[] args) {
        Circle C = new Circle();
        System.out.println("The area of the circle is "+C.area(15));
    }
}