import java.util.Scanner;

public class P1117 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (m == n && n == 0)
				break;
			else {
				int sun1 = n * 100;
				int sun = sun1 % m;
				if (sun == 0)
					System.out.print("00" + " ");
				int div = m - sun;
				while (div < 100) {
					if (div < 10)
						System.out.print("0" + div + " ");
					else {
						if (div + m < 100)
							System.out.print(div + " ");
						else
							System.out.print(div);
					}
					div += m;
				}
				System.out.print("\n");
			}
		}
		cin.close();
	}
}
