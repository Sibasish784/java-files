package Java11FebAssignments.PassByReferencein3Class;
class Peoples
{
    void want()
    {
        System.out.println("We want to go to Mars");
    }
}

class Scientists
{
    static void planning(Peoples pe)
    {
        pe.want();
    }

}


class Mars
{
    public static void main(String[] args)
    {
        Peoples Plan1 = new Peoples();
        Scientists.planning(Plan1);
    }
}