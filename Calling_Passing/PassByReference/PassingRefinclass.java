package Calling_Passing.PassByReference;
class Product
{
    void name()
    {
        System.out.println("Product name");
    }
}

 class InnerPassingRefinclass {

    static void display(Product p)
    {
    p.name();
    }
}

class PassingRefinclass
{
    public static void main(String[] args) {
        Product p = new Product();
        InnerPassingRefinclass.display(p);
    }
}