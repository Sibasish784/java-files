package vowelAndConsonent;

public class SeperatesAlphabetsNumbersAndSpecialCharsFromString 
{
	public static void main(String[] args) 
	{
		String str = "Hello World 123!@#";
		String alphabets = "";
		String numbers = "";
		String specialChars = "";

		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) 
			{
				alphabets += ch;
			} 
			else if (Character.isDigit(ch)) 
			{
				numbers += ch;
			} 
			else 
			{
				specialChars += ch;
			}
		}

		System.out.println("Alphabets: " + alphabets);
		System.out.println("Numbers: " + numbers);
		System.out.println("Special Characters: " + specialChars);
	}
}
