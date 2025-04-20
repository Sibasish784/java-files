package ArrayOpe;

public class SmallestElementOfArray 
{
     public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        int Fs = Integer.MAX_VALUE; // Initialize Fs to the maximum possible value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Fs) {
                Fs = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: " + Fs);
     }
}
