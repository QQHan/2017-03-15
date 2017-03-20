import java.io.PrintWriter;
import java.util.Scanner;

public class P1203 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
	    StringBuffer s=new StringBuffer(cin.nextLine());
	    //String[] a=s.toString().split("\\W");
	    for(String key:s.toString().split("\\W+"))
	    {
	    	cout.println(key);
	    }
		cin.close();
		cout.close();
	}
}


