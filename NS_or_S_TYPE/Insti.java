package NS_or_S_TYPE;
class Insti 
{
    static String Organization = "QSpider";
    static String Subject = "Java";
    String Std_Name;
    String Mock_Rating;

    public static void main(String[] args) 
    {
        Insti s1 = new Insti();
        s1.Std_Name = "Gita";
        s1.Mock_Rating = "1*";
        System.out.println("Organization: " + Organization);
        System.out.println("Subject: " + Subject);
        System.out.println("Student Name: " + s1.Std_Name);
        System.out.println("Mock Rating: " + s1.Mock_Rating);

        Insti s2 = new Insti();
        s2.Std_Name = "Sanju";
        s2.Mock_Rating = "2";
        System.out.println("Organization: " + Organization);
        System.out.println("Subject: " + Subject);
        System.out.println("Student Name: " + s2.Std_Name);
        System.out.println("Mock Rating: " + s2.Mock_Rating);

        s2.Mock_Rating = "1*";
        System.out.println("Student Name: " + s2.Std_Name);
        System.out.println("Mock Rating: " + s2.Mock_Rating);
    }
}
