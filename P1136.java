import java.util.Scanner;

public class P1136 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					a[i][j] = cin.nextInt();
				}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n - 1; j++) {
					System.out.print(a[j][i] + " ");
				}
				System.out.println(a[n - 1][i]);
			}
		}
		cin.close();
	}
}
