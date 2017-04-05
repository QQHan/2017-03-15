import java.util.Scanner;

public class P1571 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
			int m = cin.nextInt();
			int x = 0;
			int sum = 0;
			for (int i = 1; i <= m; i++) {
				x += i;
				sum += x;
			}
			System.out.println(sum);
		}
	}
}
