import java.io.PrintWriter;
import java.util.Scanner;

public class P1153 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static boolean Primes(int n){
			if(n%2==0)
				return false;
			for(int a=3;a*a<=n;a+=2)
				if(n%a==0)
					return false;
		    return true;
	}

	public static void main(String[] args) {
		int sum = 0;
		StringBuffer s = new StringBuffer();
		for (int i = 100; i < 200; i++) {
			if (Primes(i)) {
				if(i!=199){
				s.append(i + " ");
				}
				else{
					s.append(i);
				}
				sum++;
			}
		}
		cout.println(sum);
		cout.print(s);
		cin.close();
		cout.close();
	}
}
