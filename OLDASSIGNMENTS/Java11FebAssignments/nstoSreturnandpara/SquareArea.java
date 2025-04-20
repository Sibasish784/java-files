package oldAssignments.Java11FebAssignments.nstoSreturnandpara;
class Square
{
    int area(int a)
    {
        return a*a;
    }
}
class SquareArea{
    public static void main(String[] args)
    {
        Square A = new Square();
        System.out.println  ("The area of the square is "+A.area(1));
    }
}