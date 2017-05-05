import java.util.Scanner;
import java.util.Vector;

public class P1023 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		Vector<Integer> a = new Vector<Integer>();
		while (cin.hasNext()) {
			int temp = cin.nextInt();
			if (temp == -1)
				break;
			a.add(temp);
		}
		int max = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > max)
				max = a.get(i);
		}
		System.out.println(max);

		cin.close();
	}
}