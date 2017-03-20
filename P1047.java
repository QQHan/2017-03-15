import java.io.PrintWriter;
import java.util.Scanner;

public class P1047 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		String s=new String();
		int a=0;
		for(int i=2;i<1000;i++){
			int sum=0;
			s=String.valueOf(i);
			for(int j=0;j<s.length();j++){
				a=Integer.valueOf(s.substring(j,j+1));
				sum+=Math.pow(a,3);
			}
			if(s.equals(String.valueOf(sum))){
				cout.print(sum+" ");
			}
		}
		cin.close();
		cout.close();
	}
}
