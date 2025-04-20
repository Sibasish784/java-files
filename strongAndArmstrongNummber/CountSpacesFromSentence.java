package strongAndArmstrongNummber;

public class CountSpacesFromSentence 
{
	public static void main(String[] args) {
		String sentence = "Hello World! How are you?";
		int spaceCount = 0;

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				spaceCount++;
			}
		}

		System.out.println("Number of spaces in the sentence: " + spaceCount);
	}
}
