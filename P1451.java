import java.util.Scanner;

public class P1451 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			String s = String.valueOf(a);
			int sum = 0;
			for (int i = 0; i < s.length(); i++)
				sum += s.charAt(i) - '0';
			if (a % sum == 0)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		cin.close();
	}
}
