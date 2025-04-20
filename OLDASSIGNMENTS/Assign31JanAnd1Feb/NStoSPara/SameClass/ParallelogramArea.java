package oldAssignments.Assign31JanAnd1Feb.NStoSPara.SameClass;
class ParallelogramArea {
    void calc(double base, double height) {
        double area = base * height;
        System.out.println("Area of Parallelogram: " + area);
    }

    public static void main(String[] args) {
        new ParallelogramArea().calc(7, 4); 
    }
}