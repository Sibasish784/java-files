package Assign31JanAnd1Feb.NStoS_SameClass;
class CircleArea {
    void calc() {
        double radius = 3;
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        new CircleArea().calc(); 
    }
}