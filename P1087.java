import java.io.PrintWriter;
import java.util.Scanner;

public class P1087 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNextLine()){
			String s=new String();
			s=cin.nextLine().replaceAll(" ", "");
			cout.println(s);
		}
		cin.close();
		cout.close();
	}
}
