package methodReturnType;
class Ellipse {
    static double EllipseArea() {
        final double pi = 3.14159;
        int a = 5;
        int b = 3;
        return pi * a * b;
    }

    public static void main(String args[]) {
        System.out.println("Area of Ellipse: " + EllipseArea());
    }
}