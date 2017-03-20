import java.io.PrintWriter;
import java.util.Scanner;

public class P12172 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	private static Integer charcater;
	private static Integer character;

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int result=0;
			String s1=new String(cin.nextLine());
			String[] s=new String[3]; 
			s=s1.split("\\+|\\-");
			String num1=new String(s[0].trim());
			String num2=new String(s[1].trim());
			String c=Integer.valueOf(num1,2).toString();
			String d=Integer.valueOf(num2,2).toString();
			if(s1.contains("+")){
				result=Integer.parseInt(d)+Integer.parseInt(c);
				cout.println(charcater.toBinaryString(result));
			}
			else{
				result=Integer.parseInt(c)-Integer.parseInt(d);
				cout.println(character.toBinaryString(result));
			}
		}
		cin.close();
		cout.close();
	}
}


