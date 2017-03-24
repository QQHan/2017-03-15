import java.io.PrintWriter;
import java.util.Scanner;

public class P1210 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		String s=new String();
		while (cin.hasNext()) {
			s=cin.nextLine();
			cout.println(s);
		}
		cin.close();
		cout.close();
	}
}
