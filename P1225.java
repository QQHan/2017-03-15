import java.util.Scanner;
public class P1225 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int n =Integer.parseInt(cin.nextLine());
		while (n-- > 0) {
			int flag = 1;
			String s = cin.nextLine();
			if (s.contains(" ")) {
				flag = 0;
			} else {
				char[] s_a=s.toCharArray();
				if (!Character.isLetter(s_a[0]) && s_a[0]!= '_') {
					flag = 0;
				} else {
					for (int i = 1; i <s_a.length; i++) {
						if (!Character.isLetter(s_a[i])
								&& s.charAt(i) != '_'
								&& !Character.isDigit(s_a[i])) {
							flag = 0;
							break;
						}
					}
				}
			}
			if (flag == 1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		cin.close();
	}
}
