package oldAssignments.Java11FebAssignments.whenstaticwhennonstatic;
class Car
{
    static String name; 
    int cost;
    String type;
    
    public static void main(String[] args)
    {
        name = "Rolls Royce";
        Car C1 = new Car();
        C1.cost = 50000000;
        C1.type = "Petrol";

        Car C2 = new Car();
        C2.cost = 60000000;
        C2.type = "Diesel";

        System.out.println("Car Name is: "+name);
        System.out.println("Car 1 Cost is: "+C1.cost);
        System.out.println("Car 1 Type is: "+C1.type);
        System.out.println("------------------------");
        System.out.println("Car 2 Cost is: "+C2.cost);
        System.out.println("Car 2 Type is: "+C2.type);
    }
}