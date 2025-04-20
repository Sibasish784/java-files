package Inheratnce;
class DemoActivity
{
    void display()
    {
        System.out.println("This is a Demo Activity");
    }
}

class DemoAdvance extends DemoActivity
{
    void printing()
    {
        System.out.println("This is a Demo Advance");
    }
}

class SampleActivity extends DemoActivity
{
    void show()
    {
        System.out.println("This is a Sample Activity");
    }
}
class HybridActivity extends SampleActivity
{
    void print()
    {
        System.out.println("This is a Hybrid Activity");
    }
}



class HybridInheritance {
    public static void main(String[] args) {
        HybridActivity h = new HybridActivity();
        h.display();
        h.show();
        h.print();
		DemoAdvance D1 = new DemoAdvance();
		D1.display();
		D1.printing();
    }
    
}
