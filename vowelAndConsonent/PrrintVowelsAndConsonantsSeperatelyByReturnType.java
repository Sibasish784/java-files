package vowelAndConsonent;

public class PrrintVowelsAndConsonantsSeperatelyByReturnType 
{
	static String check(String s)
	{
		String vowels ="";
		String consonants = "";

		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') 
			{
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
					ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				{
					vowels= vowels + ch;
				} 
				else 
				{
					consonants= consonants + ch;
				}
			}
		}

		return vowels +"\n"+ consonants;
	}
	public static void main(String[] args) 
	{
		String str = "Hello World";
		String result = check(str);
		System.out.println(result);
	}
}
