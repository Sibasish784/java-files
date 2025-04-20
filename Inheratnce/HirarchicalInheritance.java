package Inheratnce;
class Past
{
    void show()
    {
        System.out.println("Past Called");
    }
}

class Present extends Past
{
    void display()
    {
        System.out.println("Present Called");
    }
}

class Future extends Past
{
    void print()
    {
        System.out.println("Future Called");
    }
}


class HirarchicalInheritance {
    public static void main(String[] args) {
        Present p = new Present();
        Future f = new Future();
        p.show();
        p.display();
        f.show();
        f.print();
    }
    
}
