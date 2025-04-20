package Calling_Passing.PassByReference;
class Mobile
{
        void disp()
	{
        System.out.println("Mobile Class called");
    }
}

class Buyer
{
   static void got(Mobile x)
    {
        x.disp();
    }
    
}
class MobileMain
{
    public static void main(String[] args)
    {
        Mobile obj = new Mobile();
        Buyer.got(obj);
    }
}
