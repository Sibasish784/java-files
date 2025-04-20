class Laptop
{
    int ram;
    String brand;
    String color;

    Laptop(int a, String b, String c)
    {
        ram = a;
        brand = b;
        color = c;
    }

    public static void main(String[] args)
    {
        Laptop l1 = new Laptop(8, "Dell", "Black");
        Laptop l2 = new Laptop(16, "HP", "White");
        Laptop l3 = new Laptop(32, "Lenovo", "Red");

        System.out.println("Laptop 1: " + l1.ram + " " + l1.brand + " " + l1.color);
        System.out.println("Laptop 2: " + l2.ram + " " + l2.brand + " " + l2.color);
        System.out.println("Laptop 3: " + l3.ram + " " + l3.brand + " " + l3.color);
    }
}
