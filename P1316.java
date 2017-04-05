import java.util.Scanner;

public class P1316 {
	static Scanner cin = new Scanner(System.in);
	static int[] A[] = new int[1000][1000];

	public static void init() {
		A[0][0] = 1;
		A[1][0] = 2;
		int k=1;
		for (int i = 1; i < 1000; i++)
			A[i][0] = A[i - 1][0] + i;
		for (int j = 0; j < 1000; j++) {
			for(int y=1;y < 1000;y++) {
				A[j][y] = A[j][y - 1] + y+k;
			}
			k++;
		}
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		init();
		while (n-- > 0) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			System.out.println(A[y][x]);
			
		}
	}
}
