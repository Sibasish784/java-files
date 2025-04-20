package assignmenttillFebJavaEkIS.InheritanceTWOForEach;
class MobileCompany
{
    void manufacture()
    {
        System.out.println("This is a MobileCompany");
    }
}

class OnePLUS extends MobileCompany
{
    void check()
    {
        System.out.println("This is a OnePLUS Mobile");
    }
}

class VIVO extends MobileCompany
{
    void checking()
    {
        System.out.println("This is a VIVO Mobile");
    }
}

class Iqoo extends VIVO
{
    void test()
    {
        System.out.println("This is a Iqoo Mobile");
    }
}

class HybridInheritanceMOile
{
    public static void main(String[] args)
    {
        System.out.println("Able to access all the 3 methods of the classes");
        Iqoo obj = new Iqoo();
        obj.manufacture();
        obj.checking();
        obj.test();

        System.out.println("Able to access only the methods of the parent class");
        OnePLUS x = new OnePLUS();
        x.manufacture();
        x.check();
    }
}


