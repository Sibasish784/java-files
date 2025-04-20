class Sector {
    static double SectorArea(int r, double angle) {
        final double pi = 3.14159;
        return 0.5 * r * r * angle * (pi/180);
    }

    public static void main(String args[]) {
        System.out.println("Area of Sector: " + SectorArea(5, 60));
    }
}