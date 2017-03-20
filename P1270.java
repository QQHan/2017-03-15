import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1270 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	static class Rectangle implements Comparable<Rectangle> {
		int num;
		int len;
		int wide;

		public int compareTo(Rectangle that) {
			if (this.num != that.num)
				return this.num - that.num;
			if (this.len != that.len)
				return this.len - that.len;
			return this.wide - that.wide;
		}
	}

	public static void main(String[] args) {
		int m = cin.nextInt();
		while (m-- > 0) {
			int n = cin.nextInt();
			Rectangle[] rectangles = new Rectangle[n];
			for (int i = 0; i < n; i++) {
				rectangles[i] = new Rectangle();
				rectangles[i].num = cin.nextInt();
				int a=cin.nextInt();
				int b=cin.nextInt();
				rectangles[i].len =a>=b? a:b;
				rectangles[i].wide=a<=b? a:b;
			}
			Arrays.sort(rectangles);
			Rectangle rect = new Rectangle();
			rect.len = 0;
			rect.num = 0;
			rect.wide = 0;
			for (int i = 0; i < n; i++) {
				if (rectangles[i].num != rect.num
						|| rectangles[i].len != rect.len
						|| rectangles[i].wide != rect.wide) {
					rect.len = rectangles[i].num;
					rect.num = rectangles[i].len;
					rect.wide = rectangles[i].wide;
					cout.println(rectangles[i].num + " " + rectangles[i].len
							+ " " + rectangles[i].wide);
				} else {
					i++;
				}
			}
		}
		cin.close();
		cout.close();
	}
}
