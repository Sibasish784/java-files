package NStoS.NsToSRefVariable;
class Calc 
{
    void sum()
    {
        int a=10,b=20;
        System.out.println("Sum of two numbers is: "+(a+b));
    }
    void sub()
    {
        int a=20,b=10;
        System.out.println("Subtraction of two numbers is: "+(a-b));
    }
    void mul()
    {
        int a=10,b=20;
        System.out.println("Multiplication of two numbers is: "+(a*b));
    }

    public static void main(String[] args) 
    {
        Calc obj=new Calc();
        obj.sum();
        obj.sub();
        obj.mul();
    }
}
