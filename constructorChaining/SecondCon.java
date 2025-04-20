package constructorChaining;

public abstract class SecondCon extends FirestCon
{
	public SecondCon() 
	{
		super();
		System.out.println("2nd One");
	}
	public void add()
	{
		System.out.println(2+3);
	}
	
}