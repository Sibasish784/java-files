package Abstraction;
interface Apps
{
    void install();
}
class Whatsapp implements Apps
{
    public void install()
    {
        System.out.println("Whatsapp installed");
    }
}
class Facebook implements Apps
{
    public void install()
    {
        System.out.println("Facebook installed");
    }
}
class PlayStore
{
    static void installApp(Apps a)
    {
        a.install();
    }
}

class InnerAppsMain
{
    public static void main(String[] args) 
    {
        Whatsapp w = new Whatsapp();
        PlayStore.installApp(w);
        Facebook f = new Facebook();
        PlayStore.installApp(f);
    }
}