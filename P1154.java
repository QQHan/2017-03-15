import java.io.PrintWriter;
import java.util.Scanner;

public class P1154 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			StringBuffer s1=new StringBuffer();
			String s=new String();
			s=cin.nextLine();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='0'){
					s1.append('1');
				}
				else if(s.charAt(i)=='1'){
					s1.append('0');
				}
				else{
					s1.append(s.charAt(i));
				}
			}
			cout.println(s1);
		}
		cin.close();
		cout.close();
	}
}
