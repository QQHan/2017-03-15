import java.io.PrintWriter;
import java.util.Scanner;

public class P1508 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n, m;
		int A[] = new int[100000];
		int B[] = new int[100000];
		while (cin.hasNext()) {
			int flag=0;
			n = cin.nextInt();
			m = cin.nextInt();
			for (int i = 0; i < n; i++) {
				A[i] = cin.nextInt();
			}
			for (int i = 0; i < m; i++) {
				B[i] = cin.nextInt();
			}
			int boss = cin.nextInt();
			StringBuffer s=new StringBuffer();
			for(int k=0;k<m;k++)
				s.append(B[k]);
			for (int i = 0; i < n; i++) {
				String a=String.valueOf(A[i]);
				if(!s.toString().contains(a)) {
					flag = A[i];
					break;
				}
				else{
					continue;
				}
			}
			if(flag==boss) {
				cout.println("YES");
			} else {
				cout.println("NO");
			}
		}
		cin.close();
		cout.close();
	}
}
