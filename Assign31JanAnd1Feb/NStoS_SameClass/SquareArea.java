package Assign31JanAnd1Feb.NStoS_SameClass;
class SquareArea {
    void calc() {
        double side = 4;
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
        new SquareArea().calc(); 
    }
}