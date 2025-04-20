package strongAndArmstrongNummber;

public class CountWordsFromASentence 
{
	public static void main(String[] args) {
		String sentence = "Hello World! How are you?";
		int wordCount = 0;
		sentence = sentence.trim();
		for (int i = 0; i < sentence.length(); i++) {
			if (i == 0 || (sentence.charAt(i) != ' ' && sentence.charAt(i - 1) == ' ')) {
				wordCount++;
			}
		}

		System.out.println("Number of words in the sentence: " + wordCount);
	}

}
