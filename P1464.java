import java.util.Scanner;

public class P1464 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int y = 0;
		while (n-- > 0) {
			y++;
			int m = cin.nextInt();
			String s = Integer.toBinaryString(m);
			String x = new StringBuffer(s).reverse().toString();
			for (int i = 0; i < x.length(); i++) {
				if (x.charAt(i) == '1') {
					System.out.println("Case #" + y + ":" + " "
							+ (int) (Math.pow(2, i)));
					break;
				}
			}
		}
		cin.close();
	}

}
