import java.io.PrintWriter;
import java.util.Scanner;

public class P1281 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			double total = 1.0 * n * 95;
			if (total < 300)
				cout.println(total);
			else
				cout.printf("%.2f\n", total * 0.85);
		}
		cin.close();
		cout.close();
	}
}
