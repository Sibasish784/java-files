class Ellipse {
    static double EllipseArea(int a, int b) {
        final double pi = 3.14159;
        return pi * a * b;
    }

    public static void main(String args[]) {
        System.out.println("Area of Ellipse: " + EllipseArea(5, 3));
    }
}