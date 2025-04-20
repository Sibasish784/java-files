package logicsOnarray;

public class ReverseAWordInSentence 
{
public static void main(String[] args) 
	{
		String str = "This is Java a programming language";
		String[] words = str.split(" ");
		String reversedSentence = "";
		for (int i = 0; i < words.length; i++) 
		{
			if (i == 4) 
			{
				for (int j = words[i].length() - 1; j >= 0; j--) 
				{
				reversedSentence = reversedSentence + words[i].charAt(j);
				}
				System.out.print(reversedSentence+" ");
			} else {
				System.out.print(words[i] + " ");
					}
		}

	}
}
