import java.util.Scanner;

public class P1074 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
			int csf = 0, css = 0;
			int AH = 0, AM = 0, AS = 0, BH = 0, BM = 0, BS = 0;
			AH = cin.nextInt();
			AM = cin.nextInt();
			AS = cin.nextInt();
			BH = cin.nextInt();
			BM = cin.nextInt();
			BS = cin.nextInt();
			int a = AH + BH, b = AM + BM, c = AS + BS;
			css = c / 60;
			c = c % 60;
			csf = (b + css) / 60;
			b = (b + css) % 60;
			a = csf + a;
            System.out.println(a+" "+b+" "+c);
		}
	}
}
