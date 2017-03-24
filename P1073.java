import java.util.Scanner;
public class P10732 {
	static Scanner cin = new Scanner(System.in);
	public static int guess() {
		int sum = 0;
		int n = cin.nextInt();
		for (int i = 1; i < n / 5; i++) {
			for (int j = 1; j < n / 2; j++) {
				for (int k = 1; k < n; k++) {
					if (i * 5 + j * 2 + k == n) {
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
		return 0;
	}
	public static void main(String[] args) {
		while (cin.hasNext()) {
			guess();
		}
		cin.close();
	}
}
