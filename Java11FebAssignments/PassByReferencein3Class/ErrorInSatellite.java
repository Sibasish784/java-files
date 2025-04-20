package Java11FebAssignments.PassByReferencein3Class;
class Engineers
{
    void checkSatellite()
    {
        System.out.println("Satellite is working fine");
    }
}

class Nasa
{
    static void check(Engineers Attempt)
    {
        Attempt.checkSatellite();
    }
}

class ErrorInSatellite
{
    public static void main(String[] args)
    {
        Engineers E1Attempt = new Engineers();
        Nasa.check(E1Attempt);
    }
}