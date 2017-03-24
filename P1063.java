import java.io.PrintWriter;
import java.util.Scanner;

public class P1063 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int x1=0;
			int x2=0;
			int y1=0;
			int y2=0;
			String[] s=cin.nextLine().split(" ");
			x1=Integer.parseInt(s[0].trim());
			y1=Integer.parseInt(s[1].trim());
			x2=Integer.parseInt(s[2].trim());
			y2=Integer.parseInt(s[3].trim());
			double distance=Math.sqrt(1.0*(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)*1.0);
			cout.printf("%.2f\n",distance);
		}
		cin.close();
		cout.close();
	}
}
