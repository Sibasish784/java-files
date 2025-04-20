package Interface;
interface Fruits
{
    void apple();
    void orange();
    void banana();
}

abstract class AppleandOrange implements Fruits
{
    public void apple()
    {
        System.out.println("Apple");
    }
    public void orange()
    {
        System.out.println("Orange");
    }
}
class Banana extends AppleandOrange
{
    public void banana()
    {
        System.out.println("Banana");
    }
}

class Home
{
    public static void main(String[] args)
    {
        Banana f = new Banana();
        f.apple();
        f.orange();
        f.banana();
    }
}