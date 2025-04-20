class CircleArea 
{
    void areaCir() 
    {
        double radius = 5.5;
        double area = 3.14159 * radius * radius;
        System.out.println("The area of the circle of radius " + radius + " is " + area);
    }

    public static void main(String[] args) 
    {
        CircleArea obj = new CircleArea();
        obj.areaCir();
    }
}
