package methodParameter.assignment;
class SectorMp
{
    static void area(int r, double angle) {
        final double pi = 3.14159;double radians = angle * (pi / 180);
        System.out.println("The area of Sector = " + 0.5 * r * r * radians);
    }

    public static void main(String[] args) {
        area(5, 60);
        area(10, 45);
        area(3, 90);
    }
}