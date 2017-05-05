import java.util.Scanner;
public class P1014 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 8, 10, 20 };
		for (int n = 1; n < 40; n += 2) {
			int i = 0;
			int temp=0;
			while (i < a.length) {
				if (n % a[i] == 0) {
					temp = 1;
					break;
				} 
				i++;
			}
			if(temp==0)
			  System.out.print(n + "/40,");
			// System.out.println("1/40,3/40,7/40,9/40,11/40,13/40,17/40,19/40,21/40,23/40,27/40,29/40,31/40,33/40,37/40,39/40,");
		}
		cin.close();
	}
}
