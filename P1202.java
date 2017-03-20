import java.io.PrintWriter;
import java.util.Scanner;

public class P1202 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	public static void main(String[] args) {
		while (cin.hasNext()) {
			String s=new String(cin.nextLine());
			int n=s.length();
			int b=Integer.parseInt(s);
			int sum=0;
			for(int i=0;i<n;i++){
				sum+=s.charAt(i)-'0';
			}
			if(b%sum==0){
			cout.println("Lucky Word");
			}
			else{
				cout.println("No Answer");
			}
		}
		cin.close();
		cout.close();
	}
}
