package Constructor;
class ThisKey
{
    int a;
    int b;
    ThisKey(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void display()
    {
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args)
    {
        ThisKey obj = new ThisKey(10, 20);
        obj.display();
    }
}