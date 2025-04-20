package methodParaRetu;
class Trapezoid {
    static double TrapezoidArea(int a, int b, int h) {
        return 0.5 * (a + b) * h;
    }

    public static void main(String args[]) {
        System.out.println("Area of Trapezoid: " + TrapezoidArea(5, 3, 2));
    }
}