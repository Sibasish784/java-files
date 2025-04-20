package methodReturnType;
class Square 
{
    static int SquareArea()
    {
        int side = 4;
        return side * side;
    }
    public static void main(String args[])
    {
        System.out.println("Area of Square: "+SquareArea());
    }
}