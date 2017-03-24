import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1093 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			int max=0;
			String[] s=cin.nextLine().split("\\s+");
			int[] a=new int[s.length];
			for(int i=0;i<s.length;i++ ){
				a[i]=Integer.parseInt(s[i]);
			}
			Arrays.sort(a);
			cout.println(a[s.length-1]);
		}
		cin.close();
		cout.close();
	}
}
