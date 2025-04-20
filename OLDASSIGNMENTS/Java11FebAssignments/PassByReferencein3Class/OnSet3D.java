package oldAssignments.Java11FebAssignments.PassByReferencein3Class;
class Runners
{
    void run()
    {
        System.out.println("Runners::run");
    }
}

class Organizers
{
    static void organize(Runners Comp)
    {
        Comp.run();
    }
}

class OnSet3D
{
    public static void main(String[] args)
    {
        Runners R1Comp = new Runners();
        Organizers.organize(R1Comp);
    }
}