import java.util.Scanner;
public class P1459 {
	static Scanner cin = new Scanner(System.in);
	public static void Sun(int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n - i; j++) {
				if (i + j == n && 4 * i + 2 * j == m)
					System.out.println(i + " " + j);
			}
		}
	}
	public static void main(String[] args) {
		 while(cin.hasNext()){
			 int x=cin.nextInt();
			 int y=cin.nextInt();
			 Sun(x,y);
		 }
		 cin.close();
	}
}
