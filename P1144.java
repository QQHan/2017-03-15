import java.util.Scanner;
public class P1144 {
	public static boolean Primes(int n) {
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int x = 0;
			int y = 0;
			for (int i = a; i <= b; i++) {
				if (Primes(i))
					if (i < 10)
						System.out.println(i);
					else {
						String xx=String.valueOf(i);
						String yy=new StringBuffer(xx).reverse().toString();
						if(xx.equals(yy))
							System.out.println(i);
					}
			}
		}
		cin.close();
	}
}
