import java.util.Scanner;
public class p1050 {
	static Scanner cin = new Scanner(System.in);
	public static void Sun(int tot, int m) {
		int[] a = new int[tot];
		int y = 0;
		for (int i = 0; i < tot; i++) {
			a[i] = 2 * y + m + 1;
			y += m;
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int tot = n / m;
			Sun(tot, m);
			if (n % m == 0) {
				System.out.print("\n");
			} else {
				int sum = 2 * n - n % m+1;
				System.out.println(sum);
			}
		}
		cin.close();
	}
}
