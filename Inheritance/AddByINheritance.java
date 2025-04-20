package Inheritance;
class Demo
{
    int a = 110;
    int b = 111;
}

class AddByINheritance extends Demo
{
   public static void main(String[] args) 
   {
        AddByINheritance obj = new AddByINheritance();
        System.out.println("Sum of a and b is: "+(obj.a+obj.b));
        System.out.println("Value of A :"+obj.a);
        System.out.println("Value of B :"+obj.b);

   } 
}