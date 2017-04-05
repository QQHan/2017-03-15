import java.util.Scanner;
public class P1562 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int i = 0, flagx = 1, flagy = 1,xx=0,yy=0;
			int a = 0, b = 0;
			String s = cin.nextLine().trim();
			StringBuffer x = new StringBuffer();
			StringBuffer y = new StringBuffer();
			for (i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ')
					break;
				else if (!Character.isDigit(s.charAt(i)))
					flagx = 0;
				x.append(s.charAt(i));
			}
			for (int j = i + 1; j < s.length(); j++) {
				if (!Character.isDigit(s.charAt(j)))
					flagy = 0;
				y.append(s.charAt(j));
			}
			if (flagx == 1 && Integer.parseInt(x.toString()) >= 1
					&& Integer.parseInt(x.toString()) <= 1000) {
				a = Integer.parseInt(x.toString());
				System.out.print(x);
				xx=1;
			} else
				System.out.print("?");
			System.out.print(" + ");
			if (flagy == 1 && Integer.parseInt(y.toString()) >= 1
					&& Integer.parseInt(y.toString()) <= 1000) {
				b = Integer.parseInt(y.toString());
				System.out.print(b);
				yy=1;
			} else
				System.out.print("?");
			System.out.print(" = ");
			if (xx == 1 && yy == 1)
				System.out.println(a + b);
			else
				System.out.println("?");
		}
		cin.close();
	}

}
