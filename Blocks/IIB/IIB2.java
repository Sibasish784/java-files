package Blocks.IIB;
class IIB2
{
    
    {
        System.out.println("IIB1");
        add();
    }

    {
        System.out.println("IIB2");
    }

    void add()
    {
        System.out.println("add");
    }

    IIB2()
    {
        System.out.println("CONSTRUCTOR");
    }
    void instantInitilizationBlocks()
    {
    	System.out.println("This is the Instant Initilization Blocks");
    }
    public static void main(String[] args) 
    {
        System.out.println("main starts");
        IIB2 i2 = new IIB2();
        i2.instantInitilizationBlocks();
        System.out.println("main ends");
    }
}