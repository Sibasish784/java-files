package assignmenttillFebJavaEkIS.InheritanceTWOForEach;
class Kernel
{
    void display()
    {
        System.out.println("Kernel class/Super Class");
    }
}

class SingleInheritance1 extends Kernel
{

    static void general()
    {
        System.out.println("Own Method (Single Inheritance)");
    }
    public static void main(String[] args)
    {
        System.out.println("Kernel class is inherited by SingleInheritance1 class");
        SingleInheritance1 obj = new SingleInheritance1();
        obj.display();
        System.out.println("--------------------------------");
        System.out.println("Accessing own method");
        general();
        System.out.println("Completed Inheritance");
    }
}