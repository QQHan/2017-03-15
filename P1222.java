import java.util.Arrays;
import java.util.Scanner;

public class P1222 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int flag = cin.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = cin.nextInt();
			Arrays.sort(a);
			if (flag == 0) {
				for (int k : a)
					System.out.println(k);
			} else {
				for (int j = n - 1; j >= 0; j--)
					System.out.println(a[j]);
			}
		}
		cin.close();
	}
}
