package Calling_Passing.PassByReference;
class Company
{
    void name()
    {
        System.out.println("Company name");
    }
}

 class Stock {

    static void display(Company p)
    {
    p.name();
    }
}

class StockApp
{
    public static void main(String[] args) {
        Company p = new Company();
        Stock.display(p);
    }
}