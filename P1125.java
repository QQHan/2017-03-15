import java.io.PrintWriter;
import java.util.Scanner;

public class P1125 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[][] a = new int[21][21];

	public static int[][] triangle(int n) {
		a[0][0] = 1;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == 1)
					a[i][j] = 1;
				a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
			}
		}
		return a;
	}

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int[][] b = new int[21][21];
			int m = cin.nextInt();
			b = triangle(m);
			for (int i = 1; i < m + 1; i++) {
				for (int j = 1; j < i + 1; j++) {
					if (j <= i)
						cout.print(b[i][j] + " ");
					else
						cout.print(b[i][j]);
				}
				cout.print("\n");
			}
			cout.print("\n");
		}
		cin.close();
		cout.close();
	}
}
