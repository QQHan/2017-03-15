import java.util.Arrays;
import java.util.Scanner;

public class P1576 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int[] A = new int[n];
			for (int i = 0; i < n; i++) {
				A[i] = cin.nextInt();
			}
			Arrays.sort(A);
			System.out.println(A[n - 1] - A[0]);
		}
		cin.close();
	}
}
