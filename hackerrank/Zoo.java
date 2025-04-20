package hackerrank;
import java.util.*;

public class Zoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		int count_z = 0, count_o = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'z') {
				count_z++;
			} else if (str.charAt(i) == 'o') {
				count_o++;
			}
		}
		if (count_z * 2 == count_o) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
