import java.util.Scanner;

public class P1070 {
	static int a;
	static int b;

	public static int UP(int k) {
		if (k == 1)
			return a;
		if (k == 2)
			return b;
		return UP(k - 1) + UP(k - 2);
	}

	public static int Car(int k) {
		if (k == 1 || k == 2)
			return a;
		return UP(k - 2) + Car(k - 1);
	}

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			a = cin.nextInt();
			int temp = 0;
			int n = cin.nextInt();
			int m = cin.nextInt();
			int x = cin.nextInt();
			for (b = 1; b <= m; b++) {
				if (Car(n - 1) == m)
					break;
			}
			temp = Car(x);
			System.out.println(temp);
		}
	}
}
