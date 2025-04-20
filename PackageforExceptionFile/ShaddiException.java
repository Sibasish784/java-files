package PackageforExceptionFile;

public class ShaddiException extends Exception
{
    String message;

    public ShaddiException(String message)
    {
        this.message = message;
    }
    public String getMessage()
    {
        return message;
    }
}
