import java.util.Scanner;

public class P1272 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			while (n % 10 == 0) {
				n /= 10;
			}
			StringBuffer s = new StringBuffer(String.valueOf(n));
			System.out.println(s.reverse());
		}
		cin.close();
	}
}
