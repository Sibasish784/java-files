class EllipseArea {
    void calc(double a, double b) {
        double area = 3.142 * a * b;
        System.out.println("Area of Ellipse: " + area);
    }

    public static void main(String[] args) {
        new EllipseArea().calc(2, 4); 
    }
}