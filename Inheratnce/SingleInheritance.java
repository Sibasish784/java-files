package Inheratnce;
class Demo
{
    void show()
    {
        System.out.println("Super Class");
    }
}

class Sample extends Demo
{
    void display()
    {
        System.out.println("Sub Class");
    }
}

class SingleInheritance
{
    public static void main(String[] args)
    {
        Sample s = new Sample();
        s.show();
        s.display();
    }
} 
