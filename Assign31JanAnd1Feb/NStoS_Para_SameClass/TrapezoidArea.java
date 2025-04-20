package Assign31JanAnd1Feb.NStoS_Para_SameClass;
class TrapezoidArea {
    void calc(double base1, double base2, double height) {
        double area = 0.5 * (base1 + base2) * height;
        System.out.println("Area of Trapezoid: " + area);
    }

    public static void main(String[] args) {
        new TrapezoidArea().calc(3, 5, 2); 
    }
}