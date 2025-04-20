package logics.Whileloop;
class ReverseNo {
    public static void main(String[] args)
    {
        int i = 12345;
        while (i !=0)
        {
            int rem = i%10;
            System.out.print (rem);
            i = i/10;
        }
    }
    
}
