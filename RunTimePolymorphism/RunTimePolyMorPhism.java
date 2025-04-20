package RunTimePolymorphism;
class Animal 
{
    void sound() 
    {
        System.out.println("Animal is making a sound");
    }
}
class Dog extends Animal
{
    void sound() 
    {
        System.out.println("Dog is barking");
    }
}

class Snake extends Animal
{
    void sound() 
    {
        System.out.println("Snake is hissing");
    }
}

class Cat extends Animal
{
    void sound() 
    {
        System.out.println("Cat is meowing");
    }
}

class Connect1 
{
    static void conn(Animal a) 
    {
        a.sound();
    }
}
class RunTimePolyMorPhism
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        Connect1.conn(d);
        Snake s = new Snake();
        Connect1.conn(s);
        Cat c = new Cat();
        Connect1.conn(c);
    }
}