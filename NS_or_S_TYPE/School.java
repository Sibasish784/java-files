package NS_or_S_TYPE;
class School 
{
    static String NameOfSchool;
    static String Address;
    String Std_name;
    int Std_rollno;
    double Std_marks;

    public static void main(String[] args) 
    {
        School.NameOfSchool = "DPS";
        School.Address = "Delhi";
        School s1 = new School();
        s1.Std_name = "Rahul";
        s1.Std_rollno = 101;
        s1.Std_marks = 90.5;

        System.out.println("Name of School: " + School.NameOfSchool);
        System.out.println("Address: " + School.Address);
        System.out.println("Student Name: " + s1.Std_name);
        System.out.println("Student Roll No: " + s1.Std_rollno);
        System.out.println("Student Marks: " + s1.Std_marks);

        School s2 = new School();
        s2.Std_name = "Rohit";
        s2.Std_rollno = 102;
        s2.Std_marks = 85.5;

        System.out.println("Student Name: " + s2.Std_name);
        System.out.println("Student Roll No: " + s2.Std_rollno);
        System.out.println("Student Marks: " + s2.Std_marks);
    }
}
