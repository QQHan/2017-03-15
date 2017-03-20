import java.io.PrintWriter;
import java.util.Scanner;

public class P1545 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int sum=0;
			 StringBuffer s=new StringBuffer(cin.nextLine());
			 for(int i=0;i<s.length();i++){
				 sum+=Integer.parseInt(s.substring(i,i+1));
			 }
			 cout.println(sum);
		}
		cin.close();
		cout.close();
	}
}

