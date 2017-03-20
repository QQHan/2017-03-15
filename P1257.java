import java.io.PrintWriter;
import java.util.Scanner;

public class P1257 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNextLine()) {
			String a = new String(cin.nextLine());
			String b = new String(cin.nextLine());
			int c = Integer.parseInt(cin.nextLine());
			int A = Integer.parseInt(a.substring(a.length() - 1, a.length()));
			int B = Integer.parseInt(b.substring(b.length() - 1, b.length()));
			if ((A + B) % 10 == c)
				cout.println("YES");
			else {
				cout.println("NO");
			}
		}
			cin.close();
			cout.close();
		}
	
}
