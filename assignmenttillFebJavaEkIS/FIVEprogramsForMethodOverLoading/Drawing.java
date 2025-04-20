package assignmenttillFebJavaEkIS.FIVEprogramsForMethodOverLoading;
class Drawing {
    void draw(int radius) {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    void draw(int length, int width) {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }

    void draw(int base, int height, String type) {
        System.out.println("Drawing a " + type + " triangle with base: " + base + " and height: " + height);
    }

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.draw(5);
        drawing.draw(4, 6);
        drawing.draw(3, 4, "isosceles");
    }
}
