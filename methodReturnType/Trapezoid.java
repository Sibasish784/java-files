package methodReturnType;
class Trapezoid {
    static double TrapezoidArea() {
        int a = 5;
        int b = 3;
        int h = 2;
        return 0.5 * (a + b) * h;
    }

    public static void main(String args[]) {
        System.out.println("Area of Trapezoid: " + TrapezoidArea());
    }
}