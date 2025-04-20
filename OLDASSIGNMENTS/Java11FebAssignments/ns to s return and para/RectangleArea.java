class Rectangle
{
    int area(int x, int y)
    {
        return x*y;
    }
}
class RectangleArea
{
    public static void main(String[] args)
    {
        Rectangle R = new Rectangle();
        System.out.println("The rectangle area is: "+R.area(15, 17));
    }
}