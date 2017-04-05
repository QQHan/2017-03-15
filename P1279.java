import java.util.Scanner;

public class P1279 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int x1 = cin.nextInt();
			int y1 = cin.nextInt();
			int x2 = cin.nextInt();
			int y2 = cin.nextInt();
			double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2)
					* (y1 - y2));
			System.out.printf("%.3f\n", distance);
		}
		cin.close();
	}
}
