class Car
{
    int id;
    String name;
    String color;
    
    Car(int a, String b, String c)
    {
        id = a;
        name = b;
        color = c;
    }

    public static void main(String[] args)
    {
        Car c1 = new Car(1, "BMW", "Black");
        Car c2 = new Car(2, "Audi", "White");
        Car c3 = new Car(3, "Mercedes", "Red");
        
        System.out.println("Car 1: " + c1.id + " " + c1.name + " " + c1.color);
        System.out.println("Car 2: " + c2.id + " " + c2.name + " " + c2.color);
        System.out.println("Car 3: " + c3.id + " " + c3.name + " " + c3.color);
    }
}