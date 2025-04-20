package Assign31JanAnd1Feb.NStoS_Para_SameClass;
class ParallelogramArea {
    void calc(double base, double height) {
        double area = base * height;
        System.out.println("Area of Parallelogram: " + area);
    }

    public static void main(String[] args) {
        new ParallelogramArea().calc(7, 4); 
    }
}