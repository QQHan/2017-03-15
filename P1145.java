import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class P1145 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[] A=new int[26];
	static String[] B = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
			"x", "y", "z" };
	public static int[] Sum(String s) {
		for (int i = 0; i < 26; i++) {
			if (s.contains(B[i])) {
				for (int j = 0; j < s.length(); j++) {
					if (s.substring(j, j + 1).equals(B[i])) {
						A[i]++;
					}
				}
			}
		}
		return A;
	}
	public static void main(String[] args) {
		String str = "";
		while (cin.hasNextLine()) {
			str = cin.nextLine();
            Sum(str);
			if (str.endsWith("#")) {
				for (int i = 0; i < 26; i++) {
					cout.println(B[i]+" "+A[i]);
				}
				break;
			}
		}
		cin.close();
		cout.close();
	}
}
