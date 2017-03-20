import java.io.PrintWriter;
import java.util.Scanner;

public class P1319 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n =Integer.parseInt(cin.nextLine());
		while (n-- >0) {
			StringBuffer s = new StringBuffer();
			String s1 = new String();
			s1 = cin.nextLine();
			String[] s2 = s1.split(" ");
		    String a=s2[0].trim();
		    String b=s2[s2.length-1].trim();
			for (int i = 0; i < a.length(); i++) {
				if (s.indexOf(a.substring(i, i + 1)) == -1) {
					s.append(a.charAt(i));
				}
			}
			if (b.contains(s)) {
				cout.println("YES");
			} else {
				cout.println("NO");
			}
		}
		cin.close();
		cout.close();
	}
}
