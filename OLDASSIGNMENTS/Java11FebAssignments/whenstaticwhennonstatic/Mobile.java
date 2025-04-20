package oldAssignments.Java11FebAssignments.whenstaticwhennonstatic;
class Mobile 
{

    static String name;
    int cost;
    String color;
    public static void main(String[] args) {
    name = "IQOO Neo 7";
    Mobile M1 = new Mobile();
    M1.cost = 30000;
    M1.color ="BLACK";

    Mobile M2 = new Mobile();
    M2.cost = 40000;
    M2.color ="WHITE";

    System.out.println("Mobile Name is: "+name);
    System.out.println("Mobile 1 Cost is: "+M1.cost);
    System.out.println("Mobile 1 Color is: "+M1.color);
    System.out.println("------------------------");
    System.out.println("Mobile 2 Cost is: "+M2.cost);
    System.out.println("Mobile 2 Color is: "+M2.color);
    }
}
