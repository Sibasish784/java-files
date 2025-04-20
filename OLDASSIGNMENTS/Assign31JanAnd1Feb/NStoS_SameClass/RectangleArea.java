class RectangleArea {
    void calc() {
        double width = 3;
        double height = 6;
        double area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        new RectangleArea().calc(); 
    }
}