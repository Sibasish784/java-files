package oldAssignments.Java11FebAssignments.FiveProgramByConstructor;
class Tree
{
    int data;
    String name;
    String color;

    Tree(int a, String b, String c)
    {
        data = a;
        name = b;
        color = c;
    }

    public static void main(String[] args)
    {
        Tree t1 = new Tree(1, "Pine", "Green");
        Tree t2 = new Tree(2, "Maple", "Red");
        Tree t3 = new Tree(3, "Oak", "Brown");

        System.out.println("Tree 1: " + t1.data + " " + t1.name + " " + t1.color);
        System.out.println("Tree 2: " + t2.data + " " + t2.name + " " + t2.color);
        System.out.println("Tree 3: " + t3.data + " " + t3.name + " " + t3.color);
    }
}