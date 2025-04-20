package RunTimePolymorphism;
class App
{
    void install()
    {
        System.out.println("App is installing");
    }
}

class Whatsapp extends App
{
    void install()
    {
        System.out.println("Whatsapp is installing");
    }
}

class Facebook extends App
{
    void install()
    {
        System.out.println("Facebook is installing");
    }
}

class Connect
{
    void conn(App a)
    {
        a.install();
    }
}
class PLaystore
{
    public static void main(String[] args)
    {
        Connect c = new Connect();
        c.conn(new Whatsapp());
        c.conn(new Facebook());
    }
}