package oldAssignments.Java11FebAssignments.FiveProgramByConstructor;
class Stringhi
{
    int length;
    int start;
    int end;

    Stringhi(int a, int b, int c)
    {
        length = a;
        start = b;
        end = c;
    }

    public static void main(String[] args)
    {
        Stringhi s = new Stringhi(10, 20, 30);
        System.out.println("Length = " + s.length+ " Start = " + s.start + " End = " + s.end);
    }
}