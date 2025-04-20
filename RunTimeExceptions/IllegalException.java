package RunTimeExceptions;

public class IllegalException 
{
    static void login(int age) throws IllegalArgumentException
    {
    	if (age > 0)
        {
            System.out.println("Login successful.");
        }
        else
        {
            throw new IllegalArgumentException("Age must be greater than 0.");
        }
    }

    public static void main(String[] args) 
    {
        try
        {
            login(-5);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
