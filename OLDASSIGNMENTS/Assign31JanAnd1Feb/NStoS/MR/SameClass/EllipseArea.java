package oldAssignments.Assign31JanAnd1Feb.NStoS.MR.SameClass;
class EllipseArea {
    double calc()
     {
        double a = 19; 
        double b = 16;
        double area = 3.142 * a * b;
        return area;
    }

    public static void main(String[] args) {
       System.out.println(new EllipseArea().calc()); 
    }
}