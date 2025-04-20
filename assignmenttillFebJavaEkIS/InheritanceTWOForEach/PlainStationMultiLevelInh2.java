package assignmenttillFebJavaEkIS.InheritanceTWOForEach;
class BasePlain
{
    void dummy()
    {
        System.out.println("BasePlain are good");
    }
}

class FirstUpdated extends BasePlain
{
    void firUpdate()
    {
        System.out.println("First Update BasePlain are good");
    }
}

class SecondUpdate extends FirstUpdated
{
    void secUpdate()
    {
        System.out.println("2nd Update From BasePlain are good");
    }
}

class PlainStationMultiLevelInh2
{
    public static void main(String[] args) 
    {
        System.out.println("Calling the Super class---------------");
        SecondUpdate hp = new SecondUpdate();
        hp.dummy();
        System.out.println("Calling the 1stSub class---------------");
        hp.firUpdate();
        System.out.println("Calling the 2ndSub class---------------");
        hp.secUpdate();
    }
}