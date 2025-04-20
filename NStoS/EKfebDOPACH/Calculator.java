package NStoS.EKfebDOPACH;
class Calculator
{
    void add()
    {
        System.out.println(2+3);
    }
    void sub()
    {
        System.out.println(2-3);
    }
    void mul()
    {
        System.out.println(2*3);
    }
    void div()
    {
        System.out.println(2/3);
    }
    public static void main(String args[])
    {
        new Calculator().add();
        new Calculator().sub();
        new Calculator().mul();
        new Calculator().div();
    }
}