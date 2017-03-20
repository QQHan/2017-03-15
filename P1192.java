import java.io.PrintWriter;
import java.util.Scanner;

public class P1192 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = Integer.parseInt(cin.nextLine());
			String s = new String(cin.nextLine());
			String[] s1 = s.split(" ");
			String a = s1[0];
			int total = 0;
			int sum = 1;
			for (int i = 1; i < s1.length; i++) {
				if (s1[i].equals(a)) {
					sum++;
				} else {
					a = s1[i];
					if (sum > total) {
						total = sum;
					}
					sum = 1;
				}
			}
			cout.println(total);
		}
		cin.close();
		cout.close();
	}
}
