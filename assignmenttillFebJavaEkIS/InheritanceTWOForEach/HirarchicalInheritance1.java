package assignmenttillFebJavaEkIS.InheritanceTWOForEach;
class SuperClass1
{
    void display()
    {
        System.out.println("SuperClass1");
    }
}

class SubClass1 extends SuperClass1
{
    void display()
    {
        System.out.println("SubClass1");
    }
}
class SuperClass2 extends SuperClass1
{
    void display()
    {
        System.out.println("SuperClass2");
    }
}

class HirarchicalInheritance1
{
    public static void main(String[] args) 
    {
        System.out.println("Hirarchical Inheritance");
        SubClass1 obj1 = new SubClass1();
        obj1.display();
        SuperClass2 obj2 = new SuperClass2();
        obj2.display();
    }
}