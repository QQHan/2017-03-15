import java.io.PrintWriter;
import java.util.Scanner;

public class P1004 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a[] = new int[4];
			for (int i = 0; i <4; i++) {
				a[i] = cin.nextInt();
			}
			for (int i = 0; i <4; i++) {
				for (int j = 0; j <4; j++) {
					for (int k = 0; k < 4; k++) {
						if (i != j && j != k && i != k) {
							System.out.print(a[i] + " ");
							System.out.print(a[j] + " ");
							System.out.println(a[k]);
						}
					}
				}
			}
		}
		cin.close();
		cout.close();
	}
}
