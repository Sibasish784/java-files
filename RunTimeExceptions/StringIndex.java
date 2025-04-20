package RunTimeExceptions;

public class StringIndex 
{
    public static void main(String[] args) {
        String str = "Hello, World!";
        try {
            System.out.println(str.charAt(20));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is out of bounds: " + e.getMessage());
        }
    }

}
