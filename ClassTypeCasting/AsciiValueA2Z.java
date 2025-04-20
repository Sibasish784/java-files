package ClassTypeCasting;
class AsciiValueA2Z
{
    public static void main(String[] args)
    {
        for (char i = 'A'; i <= 'Z'; i++)
        {
            System.out.println("The ASCII value of " + i + " is " + (int)i);
        }
    }
}