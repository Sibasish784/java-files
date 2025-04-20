class Triangle {
    static double TriangleArea(int b, int h) {
        return 0.5 * b * h;
    }

    public static void main(String args[]) {
        System.out.println("Area of Triangle: " + TriangleArea(5, 3));
    }
}