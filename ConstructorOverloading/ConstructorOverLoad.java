package ConstructorOverloading;

public class ConstructorOverLoad 
{
    ConstructorOverLoad()
    {
        System.out.println("No-argument constructor called");
    }
    ConstructorOverLoad(int a)
    {
        System.out.println("One-argument constructor called with int value: " + a);
    }
    ConstructorOverLoad(double a, double b)
    {
        System.out.println("Two-argument constructor called with double values: " + a + " and " + b);
    }
    public static void main(String[] args)
    {
        ConstructorOverLoad obj1 = new ConstructorOverLoad();
        ConstructorOverLoad obj2 = new ConstructorOverLoad(10);
        ConstructorOverLoad obj3 = new ConstructorOverLoad(10.5, 20.5);
    }
}
