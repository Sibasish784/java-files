package methodReturnType;
class Rectangle {
    static int RectangleArea() {
        int w = 5;
        int h = 3;
        return w * h;
    }

    public static void main(String args[]) {
        System.out.println("Area of Rectangle: " + RectangleArea());
    }
}