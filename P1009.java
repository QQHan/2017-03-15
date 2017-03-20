import java.io.PrintWriter;
import java.util.Scanner;

public class P1009 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			String s = new String(cin.nextLine());
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				sum += new Integer(s.substring(i, i + 1));
			}
			cout.println(sum);
		}
		cin.close();
		cout.close();
	}

}
