package variable.local;
// WAP For the Local Variable by Taking The below values


class Details
{
    public static void main(String[] args)
    {
        String nam = "Siba";
        int n = 22;
        char g = 'M';
        String DOB = "21/08/03";
        String degree = "Btech";
        String email = "01sibasish@gmail.com";
        long mobile =6666666666L;
        double per = 85.77;

		System.out.println("This is the Output In Single line");
		System.out.println(nam + " " + n + " " +g+ " "+DOB +" "+degree + " " + email + " "+ mobile +" " +per);
        System.out.println("This is the Output In Block line");
        System.out.println(nam + '\n' + n + '\n' +g+ '\n'+DOB +'\n'+degree + '\n' + email + '\n'+ mobile +'\n' +per);    
		
	}
}