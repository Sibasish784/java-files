package strongAndArmstrongNummber;

public class StrongNumber 
{
	public static void main(String[] args) {
		int num = 145;
		int sum = 0;
		int temp = num;

		while (temp != 0) {
			int digit = temp % 10;
			int fact = 1;

			for (int i = 1; i <= digit; i++) {
				fact = fact*i;
			}

			sum =sum+fact;
			temp /= 10;
		}

		if (sum == num) {
			System.out.println(num + " is a Strong number.");
		} else {
			System.out.println(num + " is not a Strong number.");
		}
	}
}
