import java.io.PrintWriter;
import java.util.Scanner;

public class P1427 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n=Integer.parseInt(cin.nextLine());
		while (n-->0) {
			int first=0;
			int second=0;
			int[] a=new int[4];
			String[] s=new String[4];
			s=cin.nextLine().split(" ");
			for(int i=0;i<4;i++){
				a[i]=Integer.parseInt(s[i]);
			}
			first=a[0]*a[1];
			second=a[2]*a[3];
			cout.println(Math.abs(first-second));
		}
		cin.close();
		cout.close();
	}
}
