package oldAssignments.Assign31JanAnd1Feb.NStoSPara.SameClass;
class RectangleArea {
    void calc(double width, double height) {
        double area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        new RectangleArea().calc(3, 6); 
    }
}