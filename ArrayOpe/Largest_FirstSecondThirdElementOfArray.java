package ArrayOpe;

public class Largest_FirstSecondThirdElementOfArray 
{
    public static void main(String[] args) 
    {
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int tl = Integer.MIN_VALUE;
        int[] arr = {10, 20, 30, 40, 5, 6, 7, 80, 90};
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > fl) 
            {
                tl = sl;
                sl = fl;
                fl = arr[i];
            } 
            else if (arr[i] > sl && arr[i] != fl) 
            {
                tl = sl;
                sl = arr[i];
            } 
            else if (arr[i] > tl && arr[i] != sl && arr[i] != fl) 
            {
                tl = arr[i];
            }
        }
        System.out.println("First Largest Element: " + fl);
        System.out.println("Second Largest Element: " + sl);
        System.out.println("Third Largest Element: " + tl);
    }
}
