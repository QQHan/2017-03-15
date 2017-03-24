import java.io.PrintWriter;
import java.util.Scanner;

public class P1290 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String s=new String(cin.nextLine());
			cout.println(s.length());
		}
		cin.close();
		cout.close();
	}
}
