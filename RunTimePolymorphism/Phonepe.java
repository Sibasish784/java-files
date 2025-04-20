package RunTimePolymorphism;
class Banking
{
    public void transfer()
    {
        System.out.println("Transfer money");
    }
}
class Recharge extends Banking
{
    public void transfer()
    {
        System.out.println("Recharge money");
    }
}
class Bill extends Banking
{
    public void transfer()
    {
        System.out.println("Pay bill");
    }
}
class Pay
{
    public void pay(Banking b)
    {
        b.transfer();
    }
}

class Phonepe
{
    public static void main(String[] args) 
    {
        Pay p = new Pay();
        Recharge r = new Recharge();
		p.pay(r);
        p.pay(new Bill());
    }
}