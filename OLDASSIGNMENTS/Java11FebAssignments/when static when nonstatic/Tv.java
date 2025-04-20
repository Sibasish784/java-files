class Tv
{
    static String Brand;
    int cost; 
    String type;

    public static void main(String[] args) 
    {
        Brand = "Sony";
        Tv T1 = new Tv();
        T1.cost = 50000;
        T1.type = "LED";

        Tv T2 = new Tv();
        T2.cost = 60000;
        T2.type = "OLED";

        System.out.println("Tv Brand is: "+Brand);
        System.out.println("Tv 1 Cost is: "+T1.cost);
        System.out.println("Tv 1 Type is: "+T1.type);
        System.out.println("------------------------");
        System.out.println("Tv 2 Cost is: "+T2.cost);
        System.out.println("Tv 2 Type is: "+T2.type);
    }
}