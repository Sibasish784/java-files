package Constructor;
class ParaCAndNonPara
{
    ParaCAndNonPara()
    {
        System.out.println("Constructor without parameter");
    }
    ParaCAndNonPara(int a)
    {
        System.out.println("Constructor with parameter");
        System.out.println("Value of a: "+a);
    }

    public static void main(String[] args)
    {
        System.out.println("Main method called");
        new ParaCAndNonPara();
        new ParaCAndNonPara(10);
        System.out.println("Main method ended");
    }
}