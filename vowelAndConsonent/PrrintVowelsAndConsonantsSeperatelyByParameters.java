package vowelAndConsonent;

public class PrrintVowelsAndConsonantsSeperatelyByParameters 
{
	static void check(String s)
	{
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') // (Character.isAlphabetic(ch))
			{
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
					ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				{
					vowels++;
				} 
				else 
				{
					consonants++;
				}
			}
		}

		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
	}
}
