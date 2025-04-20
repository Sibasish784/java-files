package StringPract;

public class CharWithAsciiValue {
    public static void main(String[] args) {
        String str = "Abcd";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            System.out.println("The ASCII value of " + ch + " is: " + ascii);
        }
    }

}
