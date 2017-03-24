import java.util.Scanner;

public class P1291 {
	static Scanner cin = new Scanner(System.in);

	public static boolean Judge(int n) {
		String s = String.valueOf(n);
		int sun = 0;
		for (int i = 0; i < s.length(); i++) {
			int a = s.charAt(i) - '0';
			sun += Math.pow(a, 3);
		}
		if (sun == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			for (int i = a + 1; i < b; i++) {
				if (Judge(i)) {
					System.out.println(i);
				}
			}
		}
	}
}
