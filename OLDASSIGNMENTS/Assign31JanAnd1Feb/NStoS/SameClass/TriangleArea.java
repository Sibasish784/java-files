package oldAssignments.Assign31JanAnd1Feb.NStoS.SameClass;
class TriangleArea {
    void calc() {
        double base = 5;
        double height = 8;
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    public static void main(String[] args) {
        new TriangleArea().calc();
    }
}