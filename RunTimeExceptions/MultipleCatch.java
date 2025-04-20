package RunTimeExceptions;

public class MultipleCatch 
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // This will throw ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            System.out.println("An exception occurred: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Execution completed.");
        }
    }
}
