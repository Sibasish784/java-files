package oldAssignments.Assign31JanAnd1Feb.NStoS.SameClass;
class EllipseArea {
    void calc() {
        double a = 2; 
        double b = 4; 
        double area = 3.142 * a * b;
        System.out.println("Area of Ellipse: " + area);
    }

    public static void main(String[] args) {
        new EllipseArea().calc(); 
    }
}