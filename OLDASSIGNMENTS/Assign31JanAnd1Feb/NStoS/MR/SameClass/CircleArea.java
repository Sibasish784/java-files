package oldAssignments.Assign31JanAnd1Feb.NStoS.MR.SameClass;
class CircleArea {
    double calc()
    {
        double radius = 10;
        double area = 3.142 * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        System.out.println(new CircleArea().calc()); 
    }
}