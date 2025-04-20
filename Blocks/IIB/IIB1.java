package Blocks.IIB;
class IIB1
{
    
    {
        System.out.println("IIB1");
    }

    {
        System.out.println("IIB2");
    }

    IIB1()
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
        IIB1 i1 = new IIB1();
        i1.instantInitilizationBlocks();
        System.out.println("main ends");
    }
}