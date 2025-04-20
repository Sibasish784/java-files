package Assign31JanAnd1Feb.NStoS_Para_SameClass;
class SquareArea {
    void calc(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
        new SquareArea().calc(4); 
    }
}