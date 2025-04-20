package SuperKeyword;
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
		super.status();
        System.out.println("Image");
    }
}

class WhatsappV3 extends WhatsappV2
{
    void status()
    {
		super.status();
        System.out.println("Video");
    }
}

class Whatsapp
{
    public static void main(String[] args)
    {
        WhatsappV3 v3 = new WhatsappV3();
        v3.status();
    }
}