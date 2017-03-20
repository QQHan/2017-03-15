import java.io.PrintWriter;
import java.util.Scanner;

public class P1055 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	private static int flag;

	public static void main(String[] args) {
		String[] s=cin.nextLine().split(" ");
	    int n=Integer.parseInt(s[0]);
	    int m=Integer.parseInt(s[0]);
	    String[] s3=new String[n];
	    String[] s4=new String[m];
	    String s1=cin.nextLine();
	    String s2=cin.nextLine();
	    s3=s1.split(" ");
	    s4=s2.split(" ");
	    flag=Integer.MAX_VALUE;
	    for(int i=0;i<s3.length;i++){
	    		for(int j=0;j<s4.length;j++){
	    			if(Math.abs(Integer.parseInt(s3[i])-Integer.parseInt(s4[j]))<flag){
	    				flag=Math.abs(Integer.parseInt(s3[i])-Integer.parseInt(s4[j]));
	    			}
	    		}
	    	}
	    cout.println(flag);
		cin.close();
		cout.close();
	}
}
