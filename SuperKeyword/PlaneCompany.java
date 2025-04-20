package SuperKeyword;
class Plane
{
    void fly()
    {
        System.out.println("Falcon 9 can carry 22,800 kg to LEO");
    }
}

class Cargo extends Plane
{
    void fly()
    {
		super.fly();
        System.out.println("With Fast Thrust");
    }
}

class Passenger extends Plane
{
    void fly()
    {
		super.fly();
        System.out.println("Falcon Heavy can carry 63,800 kg to LEO");
    }
}

class PlaneCompany
{
    public static void main(String args[])
    {
		Cargo c1 = new Cargo();
		c1.fly();
        Passenger p1 = new Passenger();
        p1.fly();
    }
}