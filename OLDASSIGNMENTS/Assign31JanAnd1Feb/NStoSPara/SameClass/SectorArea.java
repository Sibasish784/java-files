package oldAssignments.Assign31JanAnd1Feb.NStoSPara.SameClass;
class SectorArea {
    void calc(double radius, double angle) { 
        double radian = angle*(3.142/180); 
        double area = 0.5 * radius * radius * radian;
        System.out.println("Area of Sector: " + area);
    }

    public static void main(String[] args) {
        new SectorArea().calc(5, 60); 
    }
}