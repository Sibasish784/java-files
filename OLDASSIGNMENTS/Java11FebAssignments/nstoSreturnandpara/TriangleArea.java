package oldAssignments.Java11FebAssignments.nstoSreturnandpara;
class Triangle 
{
    double area(int x, int y)
    {
        double cal = 0.5 * x*y;
        return cal;
    }
}

class TriangleArea
{
    public static void main(String[] args)
    {
        Triangle T = new Triangle();
        System.out.println("The area of the triangle is: "+T.area(10,15));
    }
}