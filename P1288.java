import java.io.PrintWriter;
import java.util.Scanner;

public class P1288 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	 
    public static int pow(int n){
    	int a = 0;
    	int b=1;
    	for(int i=1;i<=n;i++){
    		b=b*i%1000000;
    		a=(a+b)%1000000;
    	}
    	return a;
    }
	public static void main(String[] args) {
		int m=cin.nextInt();
		cout.println(pow(m));
		cin.close();
		cout.close();
	}
}
