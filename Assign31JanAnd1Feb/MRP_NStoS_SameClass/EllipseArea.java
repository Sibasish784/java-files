package Assign31JanAnd1Feb.MRP_NStoS_SameClass;
class EllipseArea {
    double calc(double a, double b) {
        double area = 3.142 * a * b;
        return area;
    }

    public static void main(String[] args) {
       System.out.println(new EllipseArea().calc(2, 4)); 
    }
}