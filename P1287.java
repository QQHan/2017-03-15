import java.util.Scanner;
public class P1287 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int sum = 0;
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
				} else {
					n = 3 * n + 1;
				}
				sum++;
			}
			System.out.println(sum);
		}
	}
}