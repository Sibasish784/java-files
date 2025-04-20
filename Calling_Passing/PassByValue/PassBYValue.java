package Calling_Passing.PassByValue;
class PassBYValue
{

    static void add(int i, int s)
    {
        System.out.println("Sum is: "+(i+s));
    }
    public static void main(String[] args)
    {
        add(10, 20);
    }
}