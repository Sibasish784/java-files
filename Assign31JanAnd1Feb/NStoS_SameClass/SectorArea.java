package Assign31JanAnd1Feb.NStoS_SameClass;
class SectorArea {
    void calc() {
        double radius = 5;
        double angle = 60*(3.134/180);
        double area = 0.5 * radius * radius * angle;
        System.out.println("Area of Sector: " + area);
    }

    public static void main(String[] args) {
        new SectorArea().calc(); 
    }
}