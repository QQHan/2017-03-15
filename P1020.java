import java.util.Arrays;
import java.util.Scanner;

public class P1020 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int[] a = new int[10];
			for (int i = 0; i < 10; i++) {
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);
			for (int i = 9; i >= 0; i--) {
				System.out.print(a[i] + " ");
			}
			System.out.print("\n");
		}
		cin.close();
	}
}