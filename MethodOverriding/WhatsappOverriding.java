package MethodOverriding;
class WhatsappV1
{
    void status()
    {
        System.out.println("Only Text");
    }
}

class WhatsappV2 extends WhatsappV1
{
    void status()
    {
        System.out.println("Text, Image");
    }
}

class WhatsappV3 extends WhatsappV2
{
    void status()
    {
        System.out.println("Text, Image, Video");
    }
}

class WhatsappOverriding
{
    public static void main(String[] args)
    {
        WhatsappV3 v3 = new WhatsappV3();
        v3.status();
    }
}