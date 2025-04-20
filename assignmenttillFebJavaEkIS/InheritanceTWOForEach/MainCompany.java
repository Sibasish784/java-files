package assignmenttillFebJavaEkIS.InheritanceTWOForEach;
class NoteBookCompany
{
    void display()
    {
        System.out.println("This is a NoteBookCompany");
    }
}

class Dell extends NoteBookCompany
{
    void check()
    {
        System.out.println("This is a Dell Notebook");
    }
}

class HP extends NoteBookCompany
{
    void checking()
    {
        System.out.println("This is a HP Notebook");
    }
}

class Lenovo extends HP
{
    void test()
    {
        System.out.println("This is a Lenovo Notebook");
    }
}

class MainCompany
{
    public static void main(String[] args)
    {
        System.out.println("Able to access all the 3 methods of the classes");
        Lenovo obj = new Lenovo();
        obj.display();
        obj.checking();
        obj.test();

        System.out.println("Able to access only the methods of the parent class");
        Dell x = new Dell();
        x.display();
        x.check();
    }
}


