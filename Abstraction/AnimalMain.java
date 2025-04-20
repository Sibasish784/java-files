package Abstraction;
abstract class Animal
{
    abstract void sound();
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Meow");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Bark");
    }
}
class Connect
{
    static void con(Animal a)
    {
        a.sound();
    }
}

public class AnimalMain
{
    public static void main(String[] args) 
    {
        Cat c = new Cat();
        Connect.con(c);
        Dog d = new Dog();
        Connect.con(d);
    }
}