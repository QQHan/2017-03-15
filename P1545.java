import java.io.PrintWriter;
import java.util.Scanner;

public class P1545 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int sum=0;
			 String s=new String(cin.nextLine());
			  int a=Integer.parseInt(s.trim()); 
			 for(int i=0;i<s.length();i++){
				 sum+=a%10;
				 a=a/10;
		 }
			 cout.println(sum);
		}
		cin.close();
		cout.close();
	}
}

