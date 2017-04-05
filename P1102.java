import java.util.Scanner;

public class P1102 {
	static Scanner cin = new Scanner(System.in);

public static void main(String[] args) {
 	while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int sun_j = 0;
			int sun_o = 0;
			for (int i = n; i <= m; i++) {
				if (i % 2 == 0)
					sun_o += i * i;
				else
					sun_j += i * i * i;
			}
			System.out.println(sun_o+" "+sun_j);
		}
 	cin.close();
	}
}
