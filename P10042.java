import java.io.PrintWriter;
import java.util.Scanner;

public class P10042 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a[] = new int[4];
			for (int i = 0; i <4; i++) {
				a[i] = cin.nextInt();
			}
			System.out.println(a[0]+" "+a[1]+" "+a[2]);
			System.out.println(a[0]+" "+a[2]+" "+a[1]);
			System.out.println(a[1]+" "+a[0]+" "+a[2]);
			System.out.println(a[1]+" "+a[2]+" "+a[0]);
			System.out.println(a[2]+" "+a[0]+" "+a[1]);
			System.out.println(a[2]+" "+a[1]+" "+a[0]);
			
			System.out.println(a[0]+" "+a[1]+" "+a[3]);
			System.out.println(a[0]+" "+a[3]+" "+a[1]);
			System.out.println(a[1]+" "+a[0]+" "+a[3]);
			System.out.println(a[1]+" "+a[3]+" "+a[0]);
			System.out.println(a[3]+" "+a[0]+" "+a[1]);
			System.out.println(a[3]+" "+a[1]+" "+a[0]);
			
			System.out.println(a[0]+" "+a[2]+" "+a[3]);
			System.out.println(a[0]+" "+a[3]+" "+a[2]);
			System.out.println(a[2]+" "+a[0]+" "+a[3]);
			System.out.println(a[2]+" "+a[3]+" "+a[0]);
			System.out.println(a[3]+" "+a[0]+" "+a[2]);
			System.out.println(a[3]+" "+a[2]+" "+a[0]);
			
			System.out.println(a[1]+" "+a[2]+" "+a[3]);
			System.out.println(a[1]+" "+a[3]+" "+a[2]);
			System.out.println(a[2]+" "+a[1]+" "+a[3]);
			System.out.println(a[2]+" "+a[3]+" "+a[1]);
			System.out.println(a[3]+" "+a[1]+" "+a[2]);
			System.out.println(a[3]+" "+a[2]+" "+a[1]);
		}
		cin.close();
		cout.close();
	}
}

