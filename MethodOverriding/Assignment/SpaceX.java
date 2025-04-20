package MethodOverriding.Assignment;
class Falcon_9
{
    void capacity()
    {
        System.out.println("Falcon 9 can carry 22,800 kg to LEO");
    }
}

class Falcon_9Ft extends Falcon_9
{
    void capacity()
    {
        System.out.println("Falcon 9 FT can carry 22,800 kg to LEO With Fast Thrust");
    }
}

class Falcon_Heavy extends Falcon_9
{
    void capacity()
    {
        System.out.println("Falcon Heavy can carry 63,800 kg to LEO");
    }
}

class SpaceX
{
    public static void main(String args[])
    {
        Falcon_9 f9 = new Falcon_9();
        f9.capacity();
        Falcon_9 f9Ft = new Falcon_9Ft();
        f9Ft.capacity();
        Falcon_9 fHeavy = new Falcon_Heavy();
        fHeavy.capacity();
    }
}