import java.util.Arrays;
import java.util.Scanner;

public class P1081 {
	static Scanner cin = new Scanner(System.in);

	static int sort(int n) {
		String s = String.valueOf(n);
		StringBuffer b = new StringBuffer();
		char[] a = new char[s.trim().length()];
		a = s.toCharArray();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
			b.append(a[i]);
		return Integer.valueOf(b.toString());
	}

	public static void main(String[] args) {
		while (cin.hasNext()) {

			int n = cin.nextInt();
			if (n == 0)
				break;
			int[] A = new int[n];
			int[] B = new int[n];
			int[] C = new int[n];
			for (int i = 0; i < n; i++) {
				C[i] = cin.nextInt();
				if (C[i] < 10)
					A[i] = C[i];
				else
					A[i] = sort(C[i]);
			}
			Arrays.sort(C);
			Arrays.sort(A);
			int flag = A[0];
			boolean f = false;
			int k = 0;
			int temp = 0;
			for (int i = 1; i < A.length; i++) {
				if (flag != A[i]) {
					temp = flag;
					if (i == 1 || temp != A[i - 2]) {
						B[k] = temp;
						k++;
					}
					f = true;
				}
				flag = A[i];
			}
			if (f) {
				if (A[A.length - 2] != A[A.length - 1])
					B[k] = A[A.length - 1];
			} else {
				System.out.println("None");
			}
			for (int i = 0; i < C.length; i++) {
				for (int j = 0; j < B.length; j++) {
					if (B[j] == sort(C[i])) {
						if (j == B.length-1||i== C.length-1)
							System.out.println(C[i]);
						else
							System.out.print(C[i] + " ");
					}
				}
			}
		}
		cin.close();
	}

}
