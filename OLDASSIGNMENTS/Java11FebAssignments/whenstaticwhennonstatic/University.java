package oldAssignments.Java11FebAssignments.whenstaticwhennonstatic;
class University
{
    static String name;
    int Est_year;
    int Number_of_students;
    String Address;
    public static void main(String[] args)
    {
        name = "Student University Of Maharashtra";
        University obj = new University();
        obj.Est_year = 1990;
        obj.Number_of_students = 8000;
        obj.Address = "Pune";
        

        University obj1 = new University();
        obj1.Est_year = 1995;
        obj1.Number_of_students = 10000;
        obj1.Address = "Mumbai";

        University obj2 = new University();
        obj2.Est_year = 2000;
        obj2.Number_of_students = 12000;
        obj2.Address = "Nagpur";

        University obj3 = new University();
        obj3.Est_year = 2005;
        obj3.Number_of_students = 15000;
        obj3.Address = "Nashik";

        System.out.println("University Name: " + name);
        System.out.println("Establishment Year: " + obj.Est_year);
        System.out.println("Number of Students: " + obj.Number_of_students);
        System.out.println("Address: " + obj.Address);
        System.out.println("---------------------------------");
        System.out.println("University Name: " + name);
        System.out.println("Establishment Year: " + obj1.Est_year);
        System.out.println("Number of Students: " + obj1.Number_of_students);
        System.out.println("Address: " + obj1.Address);
        System.out.println("---------------------------------");
        System.out.println("University Name: " + name);
        System.out.println("Establishment Year: " + obj2.Est_year);
        System.out.println("Number of Students: " + obj2.Number_of_students);
        System.out.println("Address: " + obj2.Address);
        System.out.println("---------------------------------");
        System.out.println("University Name: " + name);
        System.out.println("Establishment Year: " + obj3.Est_year);
        System.out.println("Number of Students: " + obj3.Number_of_students);
        System.out.println("Address: " + obj3.Address);
        
    }
}