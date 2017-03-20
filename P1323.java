import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1323 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	static class Brother implements Comparable<Brother>{
		String name;
		int year;
		int mouth;
		int day;

		public int compareTo(Brother that) {
			if (this.name != that.name) {
				if (this.year != that.year)
					return this.year - that.year;
				if (this.mouth != that.mouth)
					return this.mouth - that.mouth;
				return this.day - that.day;
			}
			return 0;
		}
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		Brother[] brothers = new Brother[n];
		for (int i = 0; i < n; i++) {
			brothers[i] = new Brother();
			brothers[i].name = cin.next();
			brothers[i].year = cin.nextInt();
			brothers[i].mouth = cin.nextInt();
			brothers[i].day = cin.nextInt();
		}
		Arrays.sort(brothers);
		for (int i = 0; i < n; i++) {
			cout.println(brothers[i].name);
		}
		cin.close();
		cout.close();
	}
}
