import java.util.Arrays;
import java.util.Scanner;

public class P1220 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = cin.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]);
		for (int j = 1; j < n; j++) {
			if (a[j] != a[j - 1])
				System.out.println(a[j]);
		}
		cin.close();
	}
}
