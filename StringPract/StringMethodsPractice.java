package StringPract;

class StringMethodsPractice
{
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        System.out.println(s == s1); // true compare the address
        System.out.println(s == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s.equals(s2)); // true compare the value stored in string object
        System.out.println(s2.equals(s3)); // true

        int a = s.length(); // 5
        int b = s.charAt(0); // H
        System.out.println(a);
        System.out.println(b);
        String c = s.toLowerCase();
        System.out.println(c); // hello
        String d = s.toUpperCase();
        System.out.println(d); // HELLO
    }
}