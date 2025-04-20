class Circle {
    static double CircleArea() {
        final double pi = 3.14159;
        int r = 5;
        return pi * r * r;
    }

    public static void main(String args[]) {
        System.out.println("Area of Circle: " + CircleArea());
    }
}