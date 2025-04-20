class SectorArea {
    double calc(double radius, double angle) { 
        double radian = angle*(3.142/180); 
        double area = 0.5 * radius * radius * radian;
        return area;
    }

    public static void main(String[] args) {
        System.out.println(new SectorArea().calc(5, 60)); 
    }
}