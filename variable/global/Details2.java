package variable.global;
// WAP For the Global Variable by Taking The below values

class Details2
{
		static String nam = "Siba";
        static int n = 22;
        static char g = 'M';
        static String DOB = "21/08/03";
        static String degree = "Btech";
        static String email = "01sibasish@gmail.com";
        static long mobile =6666666666L;
        static double per = 85.77;

    public static void main(String[] args)
    {
        System.out.println("This is the Output In Single line");
		System.out.println(nam + " " + n + " " +g+ " "+DOB +" "+degree + " " + email + " "+ mobile +" " +per);
        System.out.println("This is the Output In Block line");
        System.out.println(nam + '\n' + n + '\n' +g+ '\n'+DOB +'\n'+degree + '\n' + email + '\n'+ mobile +'\n' +per);

    }
}