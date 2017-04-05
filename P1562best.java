import java.util.Scanner;

public class P1562best {
	static boolean ok(String s) {
		int n;
		try {
			n = Integer.parseInt(s);
			return n <= 1000 && n >= 1;
		} catch (Exception e) {
			return false;
		}
	}

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String ss = cin.nextLine();
			int index = ss.indexOf(" ");
			String sa = ss.substring(0, index);
			String sb = ss.substring(index + 1);
			if (ok(sa) && ok(sb))
				System.out.println(String.format("%d + %d = %d",
						Integer.parseInt(sa), Integer.parseInt(sb),
						Integer.parseInt(sb) + Integer.parseInt(sa)));
			else {
				if (ok(sa))
					System.out.print(Integer.parseInt(sa));
				else
					System.out.print("?");
				System.out.print(" + ");
				if (ok(sb))
					System.out.print(Integer.parseInt(sb));
				else
					System.out.print("?");
				System.out.print(" = ?");
			}
		}
		cin.close();
	}
}
