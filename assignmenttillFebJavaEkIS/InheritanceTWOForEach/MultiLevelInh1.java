package assignmenttillFebJavaEkIS.InheritanceTWOForEach;
class Movies
{
    void show()
    {
        System.out.println("Movies are good");
    }
}

class Hollywood extends Movies
{
    void showTime()
    {
        System.out.println("Hollywood movies are good");
    }
}

class HarryPotter extends Hollywood
{
    void showWeek()
    {
        System.out.println("Harry Potter movies are good");
    }
}

class MultiLevelInh1
{
    public static void main(String[] args) 
    {
        System.out.println("Calling the Super class---------------");
        HarryPotter hp = new HarryPotter();
        hp.show();
        System.out.println("Calling the 1stSub class---------------");
        hp.showTime();
        System.out.println("Calling the 2ndSub class---------------");
        hp.showWeek();
    }
}