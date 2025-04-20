package MethodOverloading;
class MethodOverloading
{
    static void display(int a)
    {
        System.out.println("Integer: "+a);
    }
    static void display(int a, int b)
    {
        System.out.println("Integer: "+a+" "+b);
    }
    static void display(String a)
    {
        System.out.println("String: "+a);
    }

    static void display(int a, String b)
    {
        System.out.println("Integer: "+a+" String: "+b);
    }

    static void display(String a, int b)
    {
        System.out.println("String: "+a+" Integer: "+b);
    }
    public static void main(String[] args)
    {
        display(1);
        display(1, 2);
        display("Hello");
        display(1, "Hello");
        display("Hello", 1);
    }
}