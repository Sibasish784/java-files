package staticPrograms;
class Demo
{
    static void add(int a, int b)
    {
        int i = a + b;
        System.out.println("Sum is: " + i);
    }
}

class Addition
{
    public static void main(String[] args)
    {
        Demo.add(10, 20);
    }
}
