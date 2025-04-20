package Java11FebAssignments.PassByReferencein3Class;
class C
{
    void disp()
    {
        System.out.println("Nothings");
    }
}

class D
{
    static void print(C obj)
    {
        obj.disp();
    }
}
class E
{
    public static void main(String[] args)
    {
        C obj = new C();
        D.print(obj);
    }
}