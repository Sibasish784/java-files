package oldAssignments.Assign31JanAnd1Feb.NStoSPara.SameClass;
class TriangleArea {
    void calc(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    public static void main(String[] args) {
        new TriangleArea().calc(5, 8); 
    }
}