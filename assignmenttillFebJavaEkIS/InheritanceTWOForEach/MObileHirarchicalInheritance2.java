package assignmenttillFebJavaEkIS.InheritanceTWOForEach;
class MobileBrandVivo
{
    void display()
    {
        System.out.println("MobileBrandVivo");
    }
}

class ModelNo1 extends MobileBrandVivo
{
    void display()
    {
        System.out.println("ModelNo1");
    }
}
class ModelNo2 extends MobileBrandVivo
{
    void display()
    {
        System.out.println("ModelNo2");
    }
}

class MObileHirarchicalInheritance2
{
    public static void main(String[] args) 
    {
        System.out.println("Hirarchical Inheritance");
        ModelNo1 obj1 = new ModelNo1();
        obj1.display();
        ModelNo2 obj2 = new ModelNo2();
        obj2.display();
    }
}