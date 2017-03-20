import java.io.PrintWriter;
import java.util.Scanner;

public class P1217 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	private static Integer charcater;
	private static Integer character;

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int result=0;
			String num1=new String(cin.next());
			String op=new String(cin.next());
			String num2=new String(cin.next());
			String c=Integer.valueOf(num1,2).toString();
			String d=Integer.valueOf(num2,2).toString();
			//int sum=0;
			//int total=0;
			//int a[]=new int[num1.length()];
			//int b[]=new int[num2.length()];
			//for(int i=0;i<num1.length();i++){
				//a[i]=Integer.valueOf(num1.substring(i,i+1),10);
				// sum+=Math.pow(2,num1.length()-1-i)*a[i];
			//}
			//for(int i=0;i<num2.length();i++){
				//b[i]=Integer.valueOf(num2.substring(i,i+1),10);
				//total+=Math.pow(2,num2.length()-i-1)*b[i];
			//}
			
			if(op.equals("+")){
				//result=sum+total;
				result=Integer.parseInt(d)+Integer.parseInt(c);
				cout.println(charcater.toBinaryString(result));
			}
			else{
				//result=sum-total;
				result=Integer.parseInt(c)-Integer.parseInt(d);
				cout.println(character.toBinaryString(result));
			}
		}
		cin.close();
		cout.close();
	}
}


