package oldAssignments.Assign31JanAnd1Feb.MRPNStoS.SameClass;
class CircleArea {
    double calc(double radius)
    {
        double area = 3.142 * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        System.out.println(new CircleArea().calc(3)); 
    }
}