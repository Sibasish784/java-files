package ApplicationShaddiDotCom;

import java.util.Scanner;
import PackageforExceptionFile.ShaddiException;
class ShaddiDotCom 
{
    static void login() throws ShaddiException
    {
        System.out.println("Welcome to Shaddi.com!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age > 18)
        {
            System.out.println("You are eligible to register.");
        }
        else
        {
            throw new ShaddiException("You are not eligible to register. You must be at least 18 years old.");
        }
        System.out.println("Welcom to Your PRofile");
    }
    public static void main(String[] args) 
    {
        try
        {
            login();
        }
        catch (ShaddiException e)
        {
            System.out.println(e.getMessage());
        }
	
    }
}
