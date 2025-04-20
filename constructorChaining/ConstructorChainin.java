package constructorChaining;

public class ConstructorChainin 
{
	public ConstructorChainin()
    {
        System.out.println("First Constructor");
    }
    public ConstructorChainin(int x)
    {
        this();
        System.out.println("Second Constructor");
    }
    public ConstructorChainin(int x, int y)
    {
        this(5);
        System.out.println("Third Constructor");
    }
    public static void main(String args[])
    {
    	ConstructorChainin obj = new ConstructorChainin(5, 10);
    }
}
