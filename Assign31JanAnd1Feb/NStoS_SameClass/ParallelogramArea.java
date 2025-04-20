package Assign31JanAnd1Feb.NStoS_SameClass;
class ParallelogramArea {
    void calc() {
        double base = 7;
        double height = 4;
        double area = base * height;
        System.out.println("Area of Parallelogram: " + area);
    }

    public static void main(String[] args) {
        new ParallelogramArea().calc(); 
    }
}