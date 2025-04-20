package Interface;
interface CT
{
    void cup();
}

class Ganguli implements CT
{
    public void cup()
    {
        System.out.println("Ganguli");
    }
}
class Dhoni implements CT
{
    public void cup()
    {
        System.out.println("Dhoni");
    }
}
class Rohit implements CT
{
    public void cup()
    {
        System.out.println("Rohit");
    }
}
class CTint
{
    public static void main(String[] args)
    {
        CT c = new Ganguli();
        c.cup();
        c = new Dhoni();
        c.cup();
        c = new Rohit();
        c.cup();
    }
}