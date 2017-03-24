import java.util.Scanner;
public class P1010 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			String s = String.valueOf(n);
			int sun = 0;
			for (int i = 0; i < s.length(); i++) {
				int a = s.charAt(i) - '0';
				sun += Math.pow(a, 3);
			}
			if (sun == n)
				System.out.println("1");
			else
				System.out.println("0");
		}

	}
}
