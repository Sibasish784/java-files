package NStoS.EKfebDOPACH;
class DemoAdd
{
    int add(int a, int b)
    {
        return a+b;
    }
}
class Sum
{
    public static void main(String[] args)
    {
        System.out.println(new DemoAdd().add(10, 20));
    }
}