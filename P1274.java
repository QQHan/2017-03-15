import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1274 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int[] a=new int[3];
		while (cin.hasNext()) {
			  for(int i=0;i<3;i++){
				  a[i]=cin.nextInt();
			  }
			  Arrays.sort(a);
			  cout.println(a[0]+" "+a[1]+" "+a[2]);
		}
		cin.close();
		cout.close();
	}
}
