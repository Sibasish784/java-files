class Sectora
{
    static void area() {
        final double pi = 3.14159;
        double radius = 5;
        double angle = 60; double radians = angle * (pi / 180);
        System.out.println(0.5 * radius * radius * radians);
    }
}
class SectorArea {
    public static void main(String[] args) {
        Sectora.area();
    }
}
