package composition;
class Demo
{
    int a = 10;
    int b = 20;
    void add()
    {
        System.out.println("Addition is: " + (a + b));
    }
}

class AddByComposition
{
    public static void main(String[] args) 
    {
        Demo obj = new Demo();
        obj.add();
        
    }
}