import java.io.PrintWriter;
import java.util.Scanner;

public class P1227 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n=Integer.parseInt(cin.nextLine());
		while (n-->0) {
			 String s=new String(cin.nextLine());
			 int num=0;
			 for(int i=0;i<s.length();i++){
				 if(Character.isDigit(s.charAt(i))){
					 num++;
				 }
			 }
			 cout.println(num);
		}
		cin.close();
		cout.close();
	}
}
