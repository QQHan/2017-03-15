import java.util.Calendar;
import java.util.Scanner;

public class P1526 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int x1 = cin.nextInt();
			int y1 = cin.nextInt();
			Calendar s = Calendar.getInstance();
			s.set(x1, y1-1, 1);
			System.out.println(s.getActualMaximum(Calendar.DAY_OF_MONTH));
		}
		cin.close();
	}
}
