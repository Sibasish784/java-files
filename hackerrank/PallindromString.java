package hackerrank;
import java.util.*;

public class PallindromString {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.next();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			char a = str.charAt(i);
			rev = rev + i;
		}
		if (str.equals(rev)) 
		{
			System.out.println("Yes");
		} 
		else 
		{
			System.out.println("No");
		}
	}

}
