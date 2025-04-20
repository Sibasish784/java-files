package oldAssignments.Assign31JanAnd1Feb.NStoSPara.SameClass;
class CircleArea {
    void calc(double radius) {
        double area = 3.142* radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        new CircleArea().calc(3); 
    }
}