import java.util.Scanner;

//153 370 371 407
public class P1013 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = new int[3002];
		for (int n = 1; n < 3000; n++) {
			int sun = 0;
			for (int i = 1; i <=n / 2; i++) {
				if (n % i == 0)
					sun += i;
			}
			if (sun < 3000&&sun!=n)
				a[n] = sun;
		}
		for(int j=1;j<a.length;j++){
			if(j==a[a[j]]&&j<a[j])
				System.out.print("("+j+","+a[j]+")");
			//System.out.println("(220,284)(1184,1210)(2620,2924)");
		}
		cin.close();
	}
}
