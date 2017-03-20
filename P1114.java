import java.io.PrintWriter;
import java.util.Scanner;

public class P1114 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
    static long[]a=new long[35];
    public static long list(int n){
    	long b;
    	if(n==0)
    		b=3;
    	else if(n==1)
    		b=4;
    	else if(n==2)
    		b=5;
    	else
    		b=list(n-1)+list(n-2)+list(n-3);
    	return b;
    }
	public static void main(String[] args) {
		while(cin.hasNext()){
			int n=cin.nextInt();
		    cout.println(list(n));
		}
		cin.close();
		cout.close();
	}
}

