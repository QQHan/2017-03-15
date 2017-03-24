import java.io.PrintWriter;
import java.util.Scanner;

public class P12304 {
	public static Scanner cin = new Scanner(System.in);
	public static PrintWriter cout = new PrintWriter(System.out);
	public static int[][] result;

	public static int[][] input(int n, int m) {
		int[][] input_a = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				input_a[i][j] = cin.nextInt();
		return input_a;
	}

	public static void solve(int[][] solve_a, int[][] solve_b, int n, int m,
			int x, int y) {
		result = new int[n][y];
		init(n, y);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < y; j++)
				for (int k = 0; k < m; k++) {
					result[i][j] += solve_a[i][k] * solve_b[k][j];
				}
	}

	public static void init(int n, int y) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < y; j++)
				result[i][j] = 0;
	}

	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			int n, m, x, y, c1, c2;
			n = cin.nextInt();
			m = cin.nextInt();
			if (n == m && m == 0)//Óöµ½0 0 ÍË³ö
				break;
			int[][] array_a = input(n, m);

			x = cin.nextInt();
			y = cin.nextInt();
			int[][] array_b = input(x, y);

			c1 = cin.nextInt();
			c2 = cin.nextInt();
			int[][] array_c = input(c1, c2);
			
			boolean flag = true;
			if (m == x && y == c1) {
				solve(array_a, array_b, n, m, x, y);
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < y; j++) {
						if (array_c[i][j] != result[i][j])
							flag = false;
					}
				}
			} else {
				flag = false;
			}
			if (flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		cin.close();
		cout.close();
	}
}
