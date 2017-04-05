import java.util.Scanner;

public class P1179 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			if (a + b == c)
				System.out.println(a + "+" + b + "=" + c);
			else if (a - b == c)
				System.out.println(a + "-" + b + "=" + c);
			else if (b - a == c)
				System.out.println(b + "-" + a + "=" + c);
			else if (a * b == c)
				System.out.println(a + "*" + b + "=" + c);
			else if (a / b == c && a % b == 0)
				System.out.println(a + "/" + b + "=" + c);
			else if (b / a == c && b % a == 0)
				System.out.println(b + "/" + a + "=" + c);
			else
				System.out.println("None");
		}
		cin.close();
	}
}
