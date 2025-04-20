package RunTimeExceptions;

public class ArrayIndex 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        try 
        {
            System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }
    }
}
