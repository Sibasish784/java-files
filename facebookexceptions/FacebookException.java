package facebookexceptions;

public class FacebookException extends Exception
{
	String ms;
	public FacebookException(String ms)
	{
		this.ms=ms;
	}
	public String getMessage()
	{
		return ms;
	}
	
}
