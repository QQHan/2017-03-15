import java.io.PrintWriter;
import java.util.Scanner;

public class P1544 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[] A = null;

	public static int Fib(int k) {
		if (k == 0 || k == 1)
			return 1;
		else{
		return Fib(k - 1) + Fib(k - 2);
		}
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
			int m =cin.nextInt();
			int sum = 0;
			for (int i = 0; i < m; i++) {
				sum += Fib(i);
			}
			cout.println(sum);
		}
		cin.close();
		cout.close();
	}
}
