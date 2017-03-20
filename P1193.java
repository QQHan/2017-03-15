import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1193 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	static class Student implements Comparable<Student> {
		String name;
		int index;
		int averge;
		int pgrade;
		String ganbu;
		String xibu;
		int num;
		int total;

		public int compareTo(Student that) {
			if (this.name != that.name) {
				if (this.total != that.total)
					return this.total - that.total;
				return that.index - this.index;
			}
			return 0;
		}
	}

	public static int sum(Student studs) {
		int total = 0;
		if (studs.averge > 85 && studs.xibu.contains("Y")) {
			total += 1000;
		}
		if (studs.pgrade > 80 && studs.ganbu.contains("Y")) {
			total += 850;
		}
		if (studs.averge > 90) {
			total += 2000;
		}
		if (studs.averge > 85 && studs.pgrade > 80) {
			total += 4000;
		}
		if (studs.averge > 80 && studs.num >= 1) {
			total += 8000;
		}
		return total;
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		int result = 0;
		int index2 = 0;
		int index = 0;
		Student[] studs = new Student[n];
		for (int i = 0; i < n; i++) {
			studs[i] = new Student();
			studs[i].index = i;
			studs[i].name = cin.next();
			studs[i].averge = cin.nextInt();
			studs[i].pgrade = cin.nextInt();
			studs[i].ganbu = cin.next();
			studs[i].xibu = cin.next();
			studs[i].num = cin.nextInt();
			studs[i].total = sum(studs[i]);
			result += studs[i].total;
		}
		Arrays.sort(studs);
		cout.println(studs[n - 1].name);
		cout.println(studs[n - 1].total);
		cout.println(result);
		cin.close();
		cout.close();
	}
}
