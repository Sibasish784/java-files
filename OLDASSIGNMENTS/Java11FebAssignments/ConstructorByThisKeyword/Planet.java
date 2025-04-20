class Planet
{
    int count;
    String name;
    String SolarTime;

    Planet(int count, String name, String SolarTime)
    {
        this.count = count;
        this.name = name;
        this.SolarTime = SolarTime;
    }

    void display()
    {
        System.out.println("Planet " + count + " : " + name + " Solar Time: " + SolarTime);
    }

    public static void main(String[] args)
    {
        Planet p1 = new Planet(1, "Mercury", "58.6 days");
        p1.display();
        Planet p2 = new Planet(2, "Venus", "116.75 days");
        p2.display();
        Planet p3 = new Planet(3, "Earth", "1 day");
        p3.display();
        Planet p4 = new Planet(4, "Mars", "1.03 days");
        p4.display();
    }
}