class Mobile
{
    int price;
    String model;
    String brand;

    Mobile(int a, String b, String c)
    {
        price = a;
        model = b;
        brand = c;
    }

    void display()
    {
        System.out.println("Price: " + price);
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile(1000, "M30", "Samsung");
        Mobile m2 = new Mobile(2000, "Note 10", "Samsung");

        m1.display();
        m2.display();
    }
}