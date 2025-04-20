package oldAssignments.Assign31JanAnd1Feb.NStoS.SameClass;
class TrapezoidArea {
    void calc() {
        double base1 = 3;
        double base2 = 5;
        double height = 2;
        double area = 0.5 * (base1 + base2) * height;
        System.out.println("Area of Trapezoid: " + area);
    }

    public static void main(String[] args) {
        new TrapezoidArea().calc(); 
    }
}