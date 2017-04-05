import java.util.Scanner;
public class P1515 {
	static Scanner cin = new Scanner(System.in);
	static int[][] A = new int[3][3];
	public static void init() {
		int sum = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = sum++;
			}
		}
	}
	public static void main(String[] args) {
		init();
		while (cin.hasNext()) {
			int n = cin.nextInt();
			for (int i = 0; i < n; i++) {
				int x = cin.nextInt();
				int y = cin.nextInt();
				System.out.print(A[x][y]);
			}
			System.out.print("\n");
		}
	}
}
