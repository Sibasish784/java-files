package Blocks.SIB;

class SIB1
{
    static
    {
        System.out.println("SIB1");
        add();
    }

    static 
    {
        System.out.println("SIB2");
    }

    static void add()
    {
        System.out.println(2+3);
    }

    public static void main(String[] args) 
    {
        System.out.println("main starts");
    }
}