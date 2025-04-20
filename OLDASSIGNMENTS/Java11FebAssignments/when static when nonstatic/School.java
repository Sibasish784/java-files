class School
{
    static String name;
    int strength;
    String grade;

    public static void main(String[] args)
    {
        name = "High School";
        School S1 = new School();
        S1.strength = 500;
        S1.grade = "A";

        School S2 = new School();
        S2.strength = 600;
        S2.grade = "B";

        System.out.println("School Name is: "+name);
        System.out.println("School 1 Strength is: "+S1.strength);
        System.out.println("School 1 Grade is: "+S1.grade);
        System.out.println("------------------------");
        System.out.println("School 2 Strength is: "+S2.strength);
        System.out.println("School 2 Grade is: "+S2.grade);
        
    }
}