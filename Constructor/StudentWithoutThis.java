package Constructor;
class StudentWithoutThis
{
    int rollno;
    String name;
    double fee;

    StudentWithoutThis(int roll, String nme, double fe)
    {
        rollno = roll;
        name = nme;
        fee = fe;
    }
    void display()
    {
        System.out.println(rollno + " " + name + " " + fee);
    }
    public static void main(String args[])
    {
        StudentWithoutThis s1 = new StudentWithoutThis(111, "ankit", 5000f);
        StudentWithoutThis s2 = new StudentWithoutThis(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
    
}
