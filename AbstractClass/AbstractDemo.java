package abstractClass;

abstract class Sample
{
    abstract void show();
}

class Kapil extends Sample
{
    void show()
    {
        System.out.println("Kapil");
    }
}

class Dhoni extends Sample
{
    void show()
    {
        System.out.println("Dhoni");
    }
}

public class AbstractDemo
{
    public static void main(String args[])
    {
        Sample s;
        s = new Kapil();
        s.show();
        s = new Dhoni();
        s.show();
    }
}