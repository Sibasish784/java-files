class FuPLogics
{
    static String square(int n) 
    {
        String store = "";
        while (n!=0)
        {
            int rem = n%10;
            int b  = rem*rem;
            n = n/10;
            store = b+" "+ store;
            //store = store+" "+ rem;
        } 

        return store;
    }
    public static void main(String[] args) 
    {
        System.out.print(square(5123));
    }
}