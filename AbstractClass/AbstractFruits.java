package abstractClass;

abstract class Home
{
    abstract void apple();
    abstract void graps();
}
abstract class Guest extends Home
{
    void apple()
    {
        System.out.println("Apple is good for health");
    }
}
class Guest2 extends Guest
{
    void graps()
    {
        System.out.println("Graps is good for health");
    }
}

class AbstractFruits
{
    public static void main(String args[])
    {
        Guest2 g = new Guest2();
        g.apple();
        g.graps();
    }
}