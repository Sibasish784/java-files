package assignmenttillFebJavaEkIS.InheritanceTWOForEach;
class Pegion
{
    void display()
    {
        System.out.println("Pegion class/Super Class");
    }
}

class SingleInheritance2 extends Pegion
{

    static void general()
    {
        System.out.println("Own Method (Single Inheritance)");
    }
    public static void main(String[] args)
    {
        System.out.println("Pegion class is inherited by SingleInheritance2 class");
        SingleInheritance2 obj = new SingleInheritance2();
        obj.display();
        System.out.println("--------------------------------");
        System.out.println("Accessing own method");
        general();
        System.out.println("Completed Inheritance");
    }
}