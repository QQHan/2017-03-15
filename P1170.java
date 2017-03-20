import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1170 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	static class Shi {
		int xishu;
		int zhishu;
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		int m = cin.nextInt();
		int max = n >= m ? n : m;
		Shi[] shi1 = new Shi[n + m];
		Shi[] shi2 = new Shi[max];
		for (int i = 0; i < n + m; i++) {
			shi1[i] = new Shi();
			shi1[i].xishu = cin.nextInt();
			shi1[i].zhishu = cin.nextInt();
		}
		if (n > m) {
			for (int i = 0; i < n; i++) {
				for (int j = n; j < m + n; j++) {
					if (shi1[i].zhishu != 0 && shi1[j].zhishu != 0
							&& shi1[i].zhishu == shi1[j].zhishu) {
						shi2[i].xishu = shi1[i].xishu + shi1[j].xishu;
						shi2[i].zhishu = shi1[i].zhishu;
					} else {
						shi2[i].xishu = shi1[i].xishu;
						shi2[i].zhishu = shi1[i].zhishu;
					}
				}
			}
		} else {
			for (int i = n; i < n + m; i++) {
				for (int j = 0; j < n; j++) {
					if (shi1[i].zhishu != 0 && shi1[j].zhishu != 0
							&& shi1[i].zhishu == shi1[j].zhishu) {
						shi2[i].xishu = shi1[i].xishu + shi1[j].xishu;
						shi2[i].zhishu = shi1[i].zhishu;
					} else {
						shi2[i].xishu = shi1[i].xishu;
						shi2[i].zhishu = shi1[i].zhishu;
					}
				}
			}
		}
		for (int k = 0; k < n; k++) {
			cout.println(shi2[k].xishu + " " + shi2[k].zhishu);
		}
		cin.close();
		cout.close();
	}
}
