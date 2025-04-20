package ClassTypeCasting;
class Demo1
{
    void demo()
    {
        System.out.println("Hii");
    }
}

class Sample1 extends Demo1
{
    void sample()
    {
        System.out.println("Hello");
    }
}

class DowncastingType
{
    public static void main(String[] args) 
    {
        Demo d = new Sample();
        Sample s = (Sample)d;
        s.demo();
		s.sample();
    }
}