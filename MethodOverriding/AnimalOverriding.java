package MethodOverriding;
class Animal
{
    void sound()
    {
        System.out.println("Animal is making a sound");
    }

    void food()
    {
        System.out.println("Some Food.");
    }
}

class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat is meowing");
    }

    void food()
    {
        System.out.println("Cat Food.");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog is barking");
    }

    void food()
    {
        System.out.println("Dog Food.");
    }
}

class AnimalOverriding
{
    public static void main(String[] args)
    {
        Animal obj = new Animal();
        obj.sound();
        obj.food();

        Cat c1 = new Cat();
        c1.sound();
        c1.food();

        Dog d1 = new Dog();
        d1.sound();
        d1.food();
    }
}