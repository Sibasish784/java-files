package ClassTypeCasting;
class Demo
{
    void demo()
    {
        System.out.println("Hii");
    }
}

class Sample extends Demo
{
    void sample()
    {
        System.out.println("Hello");
    }
}

class UpcastingType
{
    public static void main(String[] args) 
    {
        Demo d = new Sample();
        d.demo();
    }
}