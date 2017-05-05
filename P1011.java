import java.util.Scanner;
//153 370 371 407
public class P1011 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
			for (int n = 100; n < 1000; n++) {
				String s = String.valueOf(n);
				int sun = 0;
				for (int i = 0; i < s.length(); i++) {
					int a = s.charAt(i) - '0';
					sun += Math.pow(a, 3);
				}
				if (sun == n)
					System.out.println(n);
		}
		cin.close();
	}
}
