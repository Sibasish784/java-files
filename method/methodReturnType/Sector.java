class Sector {
    static double SectorArea() {
        final double pi = 3.14159;
        int r = 5;
        double angle = 60; 
        return 0.5 * r * r * angle * (pi/180);
    }

    public static void main(String args[]) {
        System.out.println("Area of Sector: " + SectorArea());
    }
}