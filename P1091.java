import java.io.PrintWriter;
import java.util.Scanner;
public class P1091 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNextLine()) {
			StringBuffer s=new StringBuffer();
			String s2=new String();
			String s1=new String();
			s1=cin.nextLine();
			for(int i=0;i<s1.length();i++ ){
				s.append(s1.charAt(i));
			}
			s2=s.reverse().toString();
			if(s2.equals(s1)){
				cout.println('Y');
			}
			else{
				cout.println('N');
			}
		}
		cin.close();
		cout.close();
	}
}
