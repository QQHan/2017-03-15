import java.util.Scanner;
public class P1006 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			String[] s_a = cin.nextLine().split("\\.");
			StringBuffer s = new StringBuffer();
			for (int i = 0; i < s_a.length; i++) {
				try {
					int cc = Integer.valueOf(s_a[i]);
					if (cc > 255 || cc < 0 || s_a[i].startsWith("0"))
						s.append(0);
					else
						s.append(1);
				} catch (Exception e) {
					s.append(0);
					break;
				}
			}
			if (s.toString().contains("0"))
				System.out.println("N");
			else
				System.out.println("Y");
		}
		cin.close();
	}
}
